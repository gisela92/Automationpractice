package com.rama.demos.stepdefinitions;

import com.rama.demos.tasks.SelectDress;
import com.rama.demos.tasks.YourLogoLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static com.rama.demos.userinterface.YourLogoLoginPage.*;
import static com.rama.demos.userinterface.YourLogoSelectDress.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class YourLogoPayStepDefinition {

    @When("Ingresa datos de usuario y contrasenna")
    public void ingresaDatosDeUsuarioYContrasenna(DataTable dataTable) {
        Map<String, String> datosLogin = dataTable.asMap(String.class, String.class);
        theActorInTheSpotlight().attemptsTo(YourLogoLogin.in(BTN_SING_IN_1, datosLogin.get("email"),EMAIL,
                datosLogin.get("password"),PASSWORD,
                BTN_SING_IN));
    }

    @When("selecciona prenda y realiza el pago")
    public void seleccionaPrendaYRealizaElPago(DataTable dataTable) {
        Map<String, String> datos = dataTable.asMap(String.class, String.class);
        theActorInTheSpotlight().attemptsTo(SelectDress.in(DRESSES,SUMMER_DRESSES,NAME_DRESS, IFRAME, datos.get("quantity"),QUANTITY,
                datos.get("size"),SIZE,
                datos.get("color"),COLOR,
                BTN_ADD_TOCARD));
    }

    @Then("Valida que el pago quede realizado {string}")
    public void validaQueElPagoQuedeRealizado(String string) {

    }
}
