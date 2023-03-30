package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmacionCompra.MENSAJE_CORREO;
public class MensajeCorreo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_CORREO.resolveFor(actor).getText();
    }
    public static MensajeCorreo mensajeCorreo(){
        return new MensajeCorreo();
    }
}
