package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.ui.FinalizarCompra.*;

public class FinalizarCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ACTUALIZAR),
                Click.on(BOTON_REALIZAR_PEDIDO)
        );
    }
    public static FinalizarCarrito finalizarCarrito(){
        return new FinalizarCarrito();
    }
}