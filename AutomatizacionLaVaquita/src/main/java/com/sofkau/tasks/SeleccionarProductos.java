package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaProductos.*;
import static com.sofkau.ui.PaginaProductos.BOTON_MAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_ANNADIR_AL_CARRITO,isClickable()),
                Scroll.to(OPCION_ANNADIR_AL_CARRITO),
                Click.on(OPCION_ANNADIR_AL_CARRITO),
                Click.on(CARRITO),
                WaitUntil.the(BOTON_MAS,isClickable())
        );
        extracted(actor);
    }
    private <T extends Actor> void extracted(T actor) {
        for (int i=0;i<3;i++){
            actor.attemptsTo(
                    Click.on(BOTON_MAS)
            );
        }
    }
    public static SeleccionarProductos seleccionarProductos(){
        return new SeleccionarProductos();
    }
}
