package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.FinalizarCompra.OPCION_FINALIZAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_FINALIZAR, isPresent()),
                WaitUntil.the(OPCION_FINALIZAR, isCurrentlyVisible()),
                WaitUntil.the(OPCION_FINALIZAR, isCurrentlyEnabled()),
                WaitUntil.the(OPCION_FINALIZAR, isClickable()),
                Scroll.to(OPCION_FINALIZAR),
                Click.on(OPCION_FINALIZAR)
        );
    }

    public static FinalizarCompra finalizarCompra() {
        return new FinalizarCompra();
    }
}
