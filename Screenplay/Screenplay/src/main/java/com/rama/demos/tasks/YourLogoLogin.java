package com.rama.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class YourLogoLogin implements Task {

    private Target btnLogin1;
    private String email;
    private Target fieldEmail;
    private String password;
    private Target fieldPassword;
    private Target btnLogin;

    public YourLogoLogin(Target btnLogin1, String email, Target fieldEmail, String password,  Target fieldPassword, Target btnLogin) {
        this.btnLogin1 = btnLogin1;
        this.email = email;
        this.fieldEmail = fieldEmail;
        this.password = password;
        this.fieldPassword = fieldPassword;
        this.btnLogin = btnLogin;
    }


    public static YourLogoLogin in(Target btnLogin1, String email,Target fieldEmail, String password,  Target fieldPassword, Target btnLogin) {
        return Tasks.instrumented(YourLogoLogin.class,btnLogin1, email, fieldEmail, password,  fieldPassword, btnLogin);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnLogin1),
                Enter.theValue(email).into(fieldEmail), Enter.theValue(password).into(fieldPassword),
                Click.on(btnLogin));
    }
}
