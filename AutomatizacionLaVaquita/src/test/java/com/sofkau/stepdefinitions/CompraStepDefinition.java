package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static com.sofkau.tasks.FinalizarCompra.finalizarCompra;
import static com.sofkau.tasks.IngresoTarjeta.ingresoTarjeta;
import static com.sofkau.tasks.NavegarALaMarca.navegarALaMarca;
import static com.sofkau.tasks.NavegarALosProductos.navegarALosProductos;
import static com.sofkau.tasks.NavegarAlCarrito.navegarAlCarrito;
import static com.sofkau.tasks.NavegarAlPago.navegarAlPago;
import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.tasks.SeleccionarProductos.seleccionarProductos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraStepDefinition extends Configuracion {
    @Cuando("navega hasta los productos y selecciona una marca")
    public void navegaHastaLosProductosYSeleccionaUnaMarca(){
        theActorInTheSpotlight().attemptsTo(
                navegarALosProductos(),
                thePage(),
                navegarALaMarca()
        );
    }
    @Cuando("selecciona tres de ellos")
    public void seleccionaTresDeEllos() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarProductos()
        );
    }
    @Cuando("va al carrito de compras y hace el proceso de checkout")
    public void vaAlCarritoDeComprasYHaceElProcesoDeCheckout() {
        theActorInTheSpotlight().attemptsTo(
                navegarAlCarrito(),
                navegarAlPago(),
                finalizarCompra(),
                ingresoTarjeta().conNombre("Juan Pineda")
                        .conNumeroTarjeta("123456783")
                        .conCvc("311")
                        .conExpiration("09")
                        .yConExpirationAnno("2027")
        );
    }
    /*
    @Entonces("se le indica al usuario que se hizo su orden")
    public void seLeIndicaAlUsuarioQueSeHizoSuOrden() {
        theActorInTheSpotlight().should(
                seeThat(mensajeCompra(), equalTo("ORDER PLACED!"))
        );
        quitarDriver();
    }

     */
}
