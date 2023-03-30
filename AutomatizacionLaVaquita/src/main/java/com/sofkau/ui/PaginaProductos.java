package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaProductos extends PageObject {
    public static final Target BARRA_BUSQUEDA=Target.the("Barra de busqueda de productos")
            .located(By.xpath("(//input[@id='search'])"));
    public static final Target OPCION_FRUTAS_Y_VERDURAS=Target.the("Opcion de frutas y verduras")
            .located(By.xpath("(//span[text()='Frutas y Verduras'])[2]"));
    public static final Target OPCION_ANNADIR_AL_CARRITO=Target.the("Opcion de annadir al carrito")
            .located(By.xpath("(//button[@class='action tocart primary'])[1]"));
    public static final Target CARRITO=Target.the("entrar al carrito")
            .located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/checkout/cart/'])[1]"));
    public static final Target BOTON_MAS=Target.the("Sumar productos")
            .located(By.xpath("(//a[@class='icon-plus qty-plus'])"));
}
