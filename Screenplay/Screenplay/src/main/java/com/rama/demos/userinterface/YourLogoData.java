package com.rama.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class YourLogoData {

    public static final Target TITLE= Target.the("El titulo {0}").locatedBy("//*[@class='radio-inline']//label[normalize-space()='{0}']");
    public static final Target FIRST_NAME= Target.the("El primer nombre").locatedBy("//*[@id='customer_firstname']");
    public static final Target LAST_NAME= Target.the("El apellido").locatedBy("//*[@id='customer_lastname']");
    public static final Target PASSWORD= Target.the("La contrasenna").locatedBy("//*[@id='passwd']");
    public static final Target DAY= Target.the("El dia de cumpleannos").locatedBy("//*[@id='days']");
    public static final Target MONTH1= Target.the("El mes de cumpleannos").locatedBy("//*[@id='uniform-months']");
    public static final Target MONTH= Target.the("El mes de cumpleannos").locatedBy("//*[@id='months']");
    public static final Target YEAR= Target.the("El anno de cumpleannos").locatedBy("//*[@id='years']");
    public static final Target FIRST_NAME2= Target.the("El primer nombre").locatedBy("//*[@id='firstname']");
    public static final Target LAST_NAME2= Target.the("El apellido").locatedBy("//*[@id='lastname']");
    public static final Target COMPANY= Target.the("La empresa").locatedBy("//*[@id='company']");
    public static final Target ADDRESS= Target.the("La direccion").locatedBy("//*[@id='address1']");
    public static final Target ADDRESS_LINE= Target.the("La direccion en linea").locatedBy("//*[@id='address2']");
    public static final Target CITY= Target.the("La ciudad").locatedBy("//*[@id='city']");
    public static final Target STATE= Target.the("El estado").locatedBy("//*[@id='id_state']");
    public static final Target POSTAL_CODE= Target.the("El codigo postal").locatedBy("//*[@id='postcode']");
    public static final Target INFORMATION= Target.the("La informacion").locatedBy("//*[@id='other']");
    public static final Target HOME_PHONE= Target.the("El telefono de casa").locatedBy("//*[@id='phone']");
    public static final Target MOBILE_PHONE= Target.the("El telefono movil").locatedBy("//*[@id='phone_mobile']");
    public static final Target ALIAS= Target.the("El alias").locatedBy("//*[@id='alias']");
    public static final Target BTN_CREATE= Target.the("El boton crear cuenta").locatedBy("//*[@id='submitAccount']");
    public static final Target NAME_VERIFITY= Target.the("El boton crear cuenta").locatedBy("(//*[text()='{0}'])[1]");



}
