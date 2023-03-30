package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on()
        );
    }
    public static NavegarAlCarrito navegarAlCarrito(){
        return new NavegarAlCarrito();
    }
}
