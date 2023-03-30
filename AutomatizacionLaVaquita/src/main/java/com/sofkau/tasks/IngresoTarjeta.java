package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaInicial.*;

public class IngresoTarjeta implements Task {
    private String numeroTarjeta;
    private String nombre;
    private String cvc;
    private String expiration;
    private String expirationanno;
    public IngresoTarjeta conNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta=numeroTarjeta;
        return this;
    }
    public IngresoTarjeta conNombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public IngresoTarjeta conCvc(String cvc){
        this.cvc=cvc;
        return this;
    }
    public IngresoTarjeta conExpiration(String expiration){
        this.expiration=expiration;
        return this;
    }
    public IngresoTarjeta yConExpirationAnno(String expirationanno){
        this.expirationanno=expirationanno;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(),
                Enter.theValue(numeroTarjeta).into(),
                Enter.theValue(cvc).into(),
                Enter.theValue(expiration).into(),
                Enter.theValue(expirationanno).into(),
                Click.on()
        );
    }
    public static IngresoTarjeta ingresoTarjeta(){
        return new IngresoTarjeta();
    }
}