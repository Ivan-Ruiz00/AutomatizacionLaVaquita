package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class NavegarAlPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on()
        );
    }
    public static NavegarAlPago navegarAlPago(){
        return new NavegarAlPago();
    }
}
