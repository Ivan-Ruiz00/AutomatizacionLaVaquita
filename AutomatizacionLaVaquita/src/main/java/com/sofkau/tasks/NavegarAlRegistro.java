package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaRegistro.BOTON_REGISTRO;
public class NavegarAlRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_REGISTRO)
        );
    }
    public static NavegarAlRegistro navegarAlRegistro(){
        return new NavegarAlRegistro();
    }
}
