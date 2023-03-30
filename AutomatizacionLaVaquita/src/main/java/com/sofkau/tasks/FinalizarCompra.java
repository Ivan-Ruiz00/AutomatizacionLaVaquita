package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static com.sofkau.ui.FinalizarCompra.*;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ACTUALIZAR),
                Click.on(BOTON_REALIZAR_PEDIDO),
                WaitUntil.the(BOTON_TRAMITAR_PEDIDO,isClickable()),
                Scroll.to(BOTON_TRAMITAR_PEDIDO),
                Click.on(BOTON_TRAMITAR_PEDIDO),
                WaitUntil.the(BOTON_SIGUIENTE,isClickable()),
                Scroll.to(BOTON_SIGUIENTE),
                Click.on(BOTON_SIGUIENTE),
                WaitUntil.the(OPCION_EFECTIVO,isPresent()),
                WaitUntil.the(OPCION_EFECTIVO,isCurrentlyVisible()),
                WaitUntil.the(OPCION_EFECTIVO,isCurrentlyEnabled()),
                WaitUntil.the(OPCION_EFECTIVO,isClickable()),
                Scroll.to(OPCION_EFECTIVO),
                Click.on(OPCION_EFECTIVO),
                WaitUntil.the(OPCION_EFECTIVO,isSelected()),
                WaitUntil.the(OPCION_FINALIZAR,isPresent()),
                WaitUntil.the(OPCION_FINALIZAR,isCurrentlyVisible()),
                WaitUntil.the(OPCION_FINALIZAR,isCurrentlyEnabled()),
                WaitUntil.the(OPCION_FINALIZAR,isClickable()),
                Scroll.to(OPCION_FINALIZAR),
                Click.on(OPCION_FINALIZAR)
        );
    }
    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}