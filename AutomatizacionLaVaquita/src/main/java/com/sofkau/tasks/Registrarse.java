package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;
public class Registrarse implements Task{
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String clave;
    public Registrarse conElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public Registrarse conElApellido(String apellido){
        this.apellido=apellido;
        return this;
    }
    public Registrarse conElEmail(String email){
        this.email=email;
        return this;
    }
    public Registrarse conLaDireccion(String direccion){
        this.direccion=direccion;
        return this;
    }
    public Registrarse conElTelefono(String telefono){
        this.telefono=telefono;
        return this;
    }
    public Registrarse yConLaContrasenna(String contrasenna){
        this.clave=contrasenna;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Click.on(BOTON_REGISTRARSE),
                Click.on(OPCION_GENERO),
                Enter.theValue(clave).into(CONTRASENNA),
                Click.on(SELECTOR_DIA),
                Click.on(ELEGIR_DIA),
                Click.on(SELECTOR_MES),
                Click.on(ELEGIR_MES),
                Click.on(SELECTOR_ANNO),
                Click.on(ELEGIR_ANNO),
                Enter.theValue(nombre).into(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(direccion).into(CAMPO_DIRECCION),
                Click.on(SELECTOR_PAIS),
                Click.on(ELEGIR_PAIS),
                Enter.theValue("niPutaIdea").into(CAMPO_ESTADO),
                Enter.theValue("Pulau").into(CAMPO_CIUDAD),
                Enter.theValue("508418").into(CAMPO_ZIPCODE),
                Enter.theValue(telefono).into(CAMPO_TELEFONO),
                Click.on(BOTON_ENVIAR)
            );
    }
    public static Registrarse registrarse(){
        return new Registrarse();
    }
}
