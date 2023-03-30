package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicial.BOTON_CARRITO;

public class NavegarAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CARRITO)
        );
    }
    public static NavegarAlCarrito navegarAlCarrito(){
        return new NavegarAlCarrito();
    }
}
