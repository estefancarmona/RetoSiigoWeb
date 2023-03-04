package co.com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarPagina extends Object {

    public static final Target TXT_FALABELLA = Target.the("Txt ingresar a la pagina")
            .located(By.xpath("//*[contains(@class,'gLFyf')]"));

    public static final Target BTN_FALABELLA = Target.the("Click para ingresar a la pagina de falabella")
            .located(By.xpath("//*[contains(@data-pcu,'https://www.falabella.com.co/')]"));


}

