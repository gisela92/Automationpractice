package com.rama.demos.tasks;

import com.rama.demos.models.YorLogoCreateAccountM;
import com.rama.demos.utils.splistGeneral;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.rama.demos.userinterface.YourLogoData.*;
import static com.rama.demos.userinterface.YourLogoHomePage.*;
import static com.rama.demos.userinterface.YourLogoCreateAccount.*;

public class YourLogoCreateAccountT implements Task {

    private List<YorLogoCreateAccountM> datatable;

    public YourLogoCreateAccountT(DataTable datatable) {
        this.datatable = datatable.asList(YorLogoCreateAccountM.class);
    }
    public static YourLogoCreateAccountT in(DataTable datatable) {
        return Tasks.instrumented(YourLogoCreateAccountT.class, datatable);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_SING_IN),
                Enter.theValue(datatable.get(0).getEmailAddress()).into(EMAIL_ADDRESS),
                Click.on(BTN_CREATE_ACCOUNT),
                Click.on(TITLE.called(datatable.get(0).getTitle()).of(datatable.get(0).getTitle())),
                Enter.theValue(datatable.get(0).getFirstName()).into(FIRST_NAME),
                Enter.theValue(datatable.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(datatable.get(0).getPassword()).into(PASSWORD),
                SelectFromOptions.byValue(splistGeneral.generalSplit(datatable.get(0).getDateOfBirth())[0]).from(DAY),
                Click.on(MONTH1),
                Click.on(MONTH),
               SelectFromOptions.byValue(splistGeneral.generalSplit(datatable.get(0).getDateOfBirth())[1]).from(MONTH),
                SelectFromOptions.byValue(splistGeneral.generalSplit(datatable.get(0).getDateOfBirth())[2]).from(YEAR),
                Enter.theValue(datatable.get(0).getFirstName()).into(FIRST_NAME2),
                Enter.theValue(datatable.get(0).getLastName()).into(LAST_NAME2),
                Enter.theValue(datatable.get(0).getCompany()).into(COMPANY),
                Enter.theValue(datatable.get(0).getAddress()).into(ADDRESS),
                Enter.theValue(datatable.get(0).getAddressLine()).into(ADDRESS_LINE),
                Enter.theValue(datatable.get(0).getCity()).into(CITY),
               SelectFromOptions.byVisibleText(datatable.get(0).getState()).from(STATE),
                Enter.theValue(datatable.get(0).getPostalCode()).into(POSTAL_CODE),
                Enter.theValue(datatable.get(0).getInformation()).into(INFORMATION),
                Enter.theValue(datatable.get(0).getHomePhone()).into(HOME_PHONE),
                Enter.theValue(datatable.get(0).getMobilePhone()).into(MOBILE_PHONE),
                Enter.theValue(datatable.get(0).getAlias()).into(ALIAS),
                Click.on(BTN_CREATE)


        );


    }
}
