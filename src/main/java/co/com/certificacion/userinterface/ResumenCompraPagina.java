package co.com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResumenCompraPagina extends Object{

    public static final Target PRODUCTO = Target.the("Nombre del producto")
            .located(By.xpath("//span[contains(text(),'Latam 825G...')]"));

    public static final Target PRECIO = Target.the("Valor a pagar")
            .located(By.xpath("//span[contains(@class,'fbra_text fbra_test_orderSummary__itemsTotalPrice fbra_orderSummary__itemsTotalPrice')]"));

}
