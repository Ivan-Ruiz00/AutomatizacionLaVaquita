package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaProductos.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SeleccionarCategoria implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_FRUTAS_Y_VERDURAS)
        );
    }
    public static SeleccionarCategoria seleccionarCategoria(){
        return new SeleccionarCategoria();
    }
}
