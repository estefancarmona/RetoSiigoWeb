package co.com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetalleProductoPagina extends Object{

    public static final Target BTN_AGREGAR = Target.the("boton agregar")
            .located(By.xpath("//button[@id='add-to-cart-button']"));

    public static final Target BTN_MAS = Target.the("boton mas")
            .located(By.xpath("//span[contains(text(),'+')]"));

    public static final Target BTN_GARANTIA = Target.the("boton aumentar garantia")
            .located(By.xpath("//span[contains(@class,'jsx-638735123')]"));



}
