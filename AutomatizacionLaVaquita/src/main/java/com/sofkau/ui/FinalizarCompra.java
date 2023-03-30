package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class FinalizarCompra extends PageObject {
    public static final Target BOTON_REALIZAR_PEDIDO = Target.the("Boton realizar pedido")
            .located(By.xpath("(//button[@id='top-cart-btn-checkout'])"));
    public static final Target BOTON_TRAMITAR_PEDIDO=Target.the("Boton tramitar pedido")
            .located(By.xpath("(//button[@class='action primary checkout'])[2]"));
    public static final Target BOTON_SIGUIENTE=Target.the("Boton siguiente")
            .located(By.xpath("(//span[text()='Siguiente'])"));
    public static final Target OPCION_EFECTIVO=Target.the("Opcion efectivo")
            .located(By.xpath("(//span[text()='Efectivo'])"));
    public static final Target OPCION_FINALIZAR=Target.the("Reakizar pedido")
            .located(By.xpath("(//button[@class='action primary checkout'])[2]"));
}
