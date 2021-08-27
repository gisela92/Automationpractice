package com.rama.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class YourLogoLoginPage {

    public static final Target BTN_SING_IN_1= Target.the("El boton loguearse").locatedBy("//*[@class='header_user_info']");
    public static final Target EMAIL= Target.the("El email").locatedBy("//*[@id='email']");
    public static final Target PASSWORD= Target.the("La contrasenna").locatedBy("//*[@id='passwd']");
    public static final Target BTN_SING_IN= Target.the("El boton login").locatedBy("//*[@id='SubmitLogin']");

}
