package co.com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProductoPagina extends Object{

    public static final Target BTN_AGREGAR = Target.the("boton agregar")
            .located(By.xpath("//button[@id='add-to-cart-button']"));

    public static final Target BTN_MAS = Target.the("boton mas")
            .located(By.xpath("//span[contains(text(),'+')]"));

    public static final Target BTN_GARANTIA = Target.the("boton aumentar garantia")
            .located(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]"));

    public static final Target BTN_BOLSA_COMPRA = Target.the("boton bolsa de compra")
            .located(By.xpath("//a[@id='linkButton']"));

    public static final Target BTN_RESUMEN_COMPRA = Target.the("boton resumen de compra")
            .located(By.xpath("//button[contains(text(),'Ir a comprar')]"));



}
