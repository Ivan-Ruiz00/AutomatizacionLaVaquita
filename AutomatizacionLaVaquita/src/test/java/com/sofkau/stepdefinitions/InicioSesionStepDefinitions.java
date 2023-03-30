package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Dado;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sofkau.tasks.NavegarAlInicioDeSesion.navegarAlInicioDeSesion;

public class InicioSesionStepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(InicioSesionStepDefinitions.class);
    @Dado("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio(){
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception e){
            LOGGER.info("fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Dado("navega hasta la el formulario de inicio de sesion y completa los campos")
    public void navegaHastaLaElFormularioDeInicioDeSesionYCompletaLosCampos() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    navegarAlInicioDeSesion()
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de inicio de sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
}