package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static com.sofkau.ui.PaginaInicial.*;
public class NavegarAlInicioDeSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties propiedades= null;
        try {
            propiedades = carga();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BOTON_INICIO_SESION),
                Enter.theValue(propiedades.getProperty("serenity.username")).into(CAMPO_CORREO),
                Enter.theValue(propiedades.getProperty("serenity.password")).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
    public static NavegarAlInicioDeSesion navegarAlInicioDeSesion() throws FileNotFoundException {
        return new NavegarAlInicioDeSesion();
    }
    public Properties carga() throws IOException{
        Properties propiedades = new Properties();
        FileInputStream archivo = new FileInputStream("src\\test\\resources\\serenity.properties");
        propiedades.load(archivo);
        return propiedades;
    }
}
