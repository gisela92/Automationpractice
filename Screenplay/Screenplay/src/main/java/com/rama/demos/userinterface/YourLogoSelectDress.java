package com.rama.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoSelectDress {

    public static final Target DRESSES= Target.the("El boton dresses").locatedBy("//*[@id='block_top_menu']/ul/li[2]/a");
    public static final Target SUMMER_DRESSES= Target.the("El boton summer dresses").locatedBy("//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a");
    public static final Target NAME_DRESS= Target.the("El vestido").locatedBy("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img");
    public static final Target IFRAME= Target.the("El iframe").locatedBy("//*/iframe[starts-with(@id,'fancybox-frame')]");
    public static final Target QUANTITY= Target.the("la cantidad").locatedBy("//*[@id='quantity_wanted']");
    public static final Target SIZE= Target.the("La talla").locatedBy(" //*[@id='group_1'] //option[@title='{0}']");
    public static final Target COLOR= Target.the("El color").locatedBy("//*[@class='attribute_list'] //a[@title='{0}']");
    public static final Target BTN_ADD_TOCARD= Target.the("El boton al carro").locatedBy("//*[@id='add_to_cart']/button/span");

}
