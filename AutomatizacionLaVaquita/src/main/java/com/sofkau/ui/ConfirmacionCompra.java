package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompra extends PageObject {
    public static Target MENSAJE_COMPRA=Target.the("mensaje de compra exitosa")
            .located(By.xpath("(//span[text()='Gracias por su compra!'])"));
    public static Target MENSAJE_CORREO=Target.the("Mensaje de correo")
            .located(By.xpath("(//p[text()='Te enviaremos un email de confirmación con los detalles y información del envío.'])"));
}
