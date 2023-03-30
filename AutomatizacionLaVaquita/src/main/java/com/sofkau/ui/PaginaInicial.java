package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target BOTON_INICIO_SESION= Target.the("boton de inicio de sesion")
            .located(By.xpath("(//i[@class='icon--user-vqt'])"));
    public static final Target CAMPO_CORREO= Target.the("campo de correo")
            .located(By.xpath("(//input[@id='email'])"));
    public static final Target CAMPO_CONTRASENNA= Target.the("campo de contrasenna")
            .located(By.xpath("(//input[@id='pass'])"));
    public static final Target BOTON_INICIAR_SESION= Target.the("boton para iniciar sesion")
            .located(By.xpath("(//button[@id='send2'])[1]"));
}
