package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on()
        );
    }
    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}