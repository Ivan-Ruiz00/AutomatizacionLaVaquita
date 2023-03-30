package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicial.BOTON_PLACE_ORDEN;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PLACE_ORDEN)
        );
    }
    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}