package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaInicial.BOTON_MARCA;
public class NavegarALaMarca implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MARCA)
        );
    }
    public static NavegarALaMarca navegarALaMarca(){
        return new NavegarALaMarca();
    }
}
