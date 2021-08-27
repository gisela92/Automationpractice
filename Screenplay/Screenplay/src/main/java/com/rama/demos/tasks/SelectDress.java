package com.rama.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDress implements Task {

    private Target dresses;
    private Target summerDresses;
    private Target nameDress;
    private Target iframe;
    private String quantity;
    private Target fielQuantity;
    private String size;
    private Target fieldSize;
    private String color;
    private Target fieldColor;
    private Target btnAddToCard;

    public SelectDress(Target dresses, Target summerDresses, Target nameDress, Target iframe, String quantity, Target fielQuantity, String size, Target fieldSize, String color, Target fieldColor, Target btnAddToCard) {
        this.dresses = dresses;
        this.summerDresses = summerDresses;
        this.nameDress = nameDress;
        this.iframe = iframe;
        this.quantity = quantity;
        this.fielQuantity = fielQuantity;
        this.size = size;
        this.fieldSize = fieldSize;
        this.color = color;
        this.fieldColor = fieldColor;
        this.btnAddToCard = btnAddToCard;
    }

    public static SelectDress in(Target dresses, Target summerDresses, Target nameDress, Target iframe, String quantity,  Target fielQuantity, String size, Target fieldSize, String color, Target fieldColor, Target btnAddToCard) {
        return Tasks.instrumented(SelectDress.class,dresses, summerDresses, nameDress,iframe, quantity,  fielQuantity, size, fieldSize, color, fieldColor, btnAddToCard);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
               actor.attemptsTo(
                       MoveMouse.to(dresses),
                Click.on(summerDresses),
               Click.on(nameDress)
 //Enter.theValue(quantity).into(fielQuantity),
               // Enter.theValue(size).into(fieldSize),
                //Enter.theValue(color).into(fieldColor),
                       //SelectFromOptions.byVisibleText("Paris").from(SELECT_CITY)

                //Click.on(btnAddToCard)
                       );

    }
}
