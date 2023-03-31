package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.FinalizarCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class PasarPasarellaDeDireccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_TRAMITAR_PEDIDO,isClickable()),
                Scroll.to(BOTON_TRAMITAR_PEDIDO),
                Click.on(BOTON_TRAMITAR_PEDIDO)
        );
    }
    public static PasarPasarellaDeDireccion pasarPasarellaDeDireccion(){
        return new PasarPasarellaDeDireccion();
    }
}
