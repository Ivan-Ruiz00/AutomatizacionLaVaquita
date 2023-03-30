package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class SeleccionarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i=1;i<6;i++) {
            actor.attemptsTo(
                    Click.on("(//a[@class='btn btn-default add-to-cart'])["+i+"]"),
                    Click.on()
            );
            i++;
        }
    }
    public static SeleccionarProductos seleccionarProductos(){
        return new SeleccionarProductos();
    }
}
