package com.rama.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class YourLogoCreateAccount {

    public static final Target EMAIL_ADDRESS= Target.the("El campo email").locatedBy("//*[@id='email_create']");
    public static final Target BTN_CREATE_ACCOUNT= Target.the("El boton crear cuenta").locatedBy("//*[@id='SubmitCreate']");

}
