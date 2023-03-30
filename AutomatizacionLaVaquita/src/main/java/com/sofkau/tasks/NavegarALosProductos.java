package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarALosProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on()
        );
    }
    public static NavegarALosProductos navegarALosProductos(){
        return new NavegarALosProductos();
    }
}
