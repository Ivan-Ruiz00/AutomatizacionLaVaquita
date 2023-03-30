package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionRegistro extends PageObject {

    public static Target MENSAJE_INICIO = Target.the("mensaje con el nombre")
            .located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
    public static Target MENSAJE_REGISTRO=Target.the("mensaje de registro exitoso")
            .located(By.xpath("(//h2[@data-qa='account-created'])"));
    public static Target MENSAJE_COMPRA=Target.the("mensaje de compra exitosa")
            .located(By.xpath("(//h2[@data-qa='order-placed'])"));
}
