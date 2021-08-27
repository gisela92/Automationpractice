package com.rama.demos.stepdefinitions;

import com.rama.demos.questions.GetText;
import com.rama.demos.tasks.YourLogoCreateAccountT;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.rama.demos.userinterface.YourLogoData.NAME_VERIFITY;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class YourLogoCreateAccountStepDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} Desea ir a la pagina de {string}")
	public void deseaIrALaPaginaDe(String actorName, String url) {
		theActorCalled(actorName).wasAbleTo(Open.url(url));
	}

	@When("Ingresa a la pagina y hace el registro de usuario")
	public void ingresaALaPaginaYHaceElRegistroDeUsuario(DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(YourLogoCreateAccountT.in(dataTable));
	}
	@Then("Valida que el usuario quede registrado {string}")
	public void validaQueElUsuarioQuedeRegistrado(String nombreUsuaurio) {
theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetText.field(NAME_VERIFITY.of(nombreUsuaurio)), Matchers.is(nombreUsuaurio)));

	}





}
