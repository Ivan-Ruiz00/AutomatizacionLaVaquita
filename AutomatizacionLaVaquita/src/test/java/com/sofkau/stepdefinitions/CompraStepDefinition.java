package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static com.sofkau.questions.MensajeCompra.mensajeCompra;
import static com.sofkau.questions.MensajeCorreo.mensajeCorreo;
import static com.sofkau.tasks.FinalizarCompra.finalizarCompra;
import static com.sofkau.tasks.NavegarALosProductos.navegarALosProductos;
import static com.sofkau.tasks.SeleccionarCategoria.seleccionarCategoria;
import static com.sofkau.tasks.SeleccionarProductos.seleccionarProductos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraStepDefinition extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinition.class);
    @Cuando("busca arandanos y selecciona frutas y verduras en la categoria")
    public void buscaArandanosYSeleccionaFrutasYVerdurasEnLaCategoria() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    navegarALosProductos().buscaElProducto("uva"),
                    seleccionarCategoria()
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de busqueda y seleccion de categoria");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Cuando("selecciona uno de ellos, va al carrito y modifica su cantidad")
    public void seleccionaUnoDeEllosVaAlCarritoYModificaSuCantidad() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    seleccionarProductos()
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de seleccion de productos y modificacion de cantidades");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Cuando("continua con el proceso, llenando el formulario y da click en realizar pedido")
    public void continuaConElProcesoLlenandoElFormularioYDaClickEnRealizarPedido() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    finalizarCompra()
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de finalizacion de la compra");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Entonces("sale un mensaje de gracias por su compra un numero de orden y un mensaje de envío por email")
    public void saleUnMensajeDeGraciasPorSuCompraUnNumeroDeOrdenYUnMensajeDeEnvíoPorEmail() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeCompra(), equalTo("Gracias por su compra!")),
                    seeThat(mensajeCorreo(),equalTo("Te enviaremos un email de confirmación con los detalles y información del envío."))
            );
        }catch (Exception e){
            LOGGER.info("fallo el proceso de finalizacion de la compra");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
        }finally {
            quitarDriver();
        }
    }
}
