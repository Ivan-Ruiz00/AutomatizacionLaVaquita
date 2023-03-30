package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaProductos.BARRA_BUSQUEDA;

public class NavegarALosProductos implements Task {
    private String producto;
    public NavegarALosProductos buscaElProducto(String producto){
        this.producto=producto;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BARRA_BUSQUEDA),
                Hit.the(Keys.ENTER).into(BARRA_BUSQUEDA)
        );
    }
    public static NavegarALosProductos navegarALosProductos(){
        return new NavegarALosProductos();
    }
}
