package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class PaginaRegistro extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton ir al registro")
            .located(By.xpath("//a[@href='/login']"));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath("//input[@data-qa='login-email']"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("//input[@data-qa='login-password']"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath("//button[@data-qa='login-button']"));
    public static final Target CAMPO_NOMBRE=Target.the("campo nombre")
            .located(By.xpath("(//input[@type='text'])"));
    public static final Target CAMPO_EMAIL=Target.the("campo email")
            .located(By.xpath("(//input[@data-qa='signup-email'])"));
    public static final Target BOTON_REGISTRARSE=Target.the("boton registrarse")
            .located(By.xpath("(//button[@data-qa='signup-button'])"));
    public static final Target OPCION_GENERO=Target.the("opcion de genero")
            .located(By.xpath("(//input[@id='id_gender1'])"));
    public static final Target CONTRASENNA=Target.the("campo contrasenna")
            .located(By.xpath("(//input[@id='password'])"));
    public static final Target SELECTOR_DIA=Target.the("selector dia")
            .located(By.xpath("(//select[@id='days'])"));
    public static final Target ELEGIR_DIA=Target.the("escoger dia")
            .located(By.xpath("(//option[@value='11'])[1]"));
    public static final Target SELECTOR_MES=Target.the("selector mes")
            .located(By.xpath("(//select[@id='months'])"));
    public static final Target ELEGIR_MES=Target.the("escoger mes")
            .located(By.xpath("(//option[@value='5'])[2]"));
    public static final Target SELECTOR_ANNO=Target.the("selector anno")
            .located(By.xpath("(//select[@id='years'])"));
    public static final Target ELEGIR_ANNO=Target.the("escoger anno")
            .located(By.xpath("(//option[@value='1995'])"));
    public static final Target CAMPO_PRIMER_NOMBRE=Target.the("campo primer nombre")
            .located(By.xpath("(//input[@id='first_name'])"));
    public static final Target CAMPO_APELLIDO=Target.the("campo primer nombre")
            .located(By.xpath("(//input[@id='last_name'])"));
    public static final Target CAMPO_DIRECCION=Target.the("campo direccion")
            .located(By.xpath("(//input[@id='address1'])"));
    public static final Target SELECTOR_PAIS=Target.the("selector pais")
            .located(By.xpath("(//select[@id='country'])"));
    public static final Target ELEGIR_PAIS=Target.the("escoger pais")
            .located(By.xpath("(//option[@value='Singapore'])"));
    public static final Target CAMPO_ESTADO=Target.the("campo state")
            .located(By.xpath("(//input[@id='state'])"));
    public static final Target CAMPO_CIUDAD=Target.the("campo city")
            .located(By.xpath("(//input[@id='city'])"));
    public static final Target CAMPO_ZIPCODE=Target.the("campo zipcode")
            .located(By.xpath("(//input[@id='zipcode'])"));
    public static final Target CAMPO_TELEFONO=Target.the("campo del telefono")
            .located(By.xpath("(//input[@id='mobile_number'])"));
    public static final Target BOTON_ENVIAR=Target.the("boton de enviar formulario")
            .located(By.xpath("(//button[@data-qa='create-account'])"));
}
