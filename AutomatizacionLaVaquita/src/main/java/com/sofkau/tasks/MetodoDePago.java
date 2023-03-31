package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.FinalizarCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class MetodoDePago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_EFECTIVO, isPresent()),
                WaitUntil.the(OPCION_EFECTIVO, isCurrentlyVisible()),
                WaitUntil.the(OPCION_EFECTIVO, isCurrentlyEnabled()),
                WaitUntil.the(OPCION_EFECTIVO, isClickable()),
                Click.on(OPCION_EFECTIVO)
        );
    }

    public static MetodoDePago metodoDePago() {
        return new MetodoDePago();
    }
}
