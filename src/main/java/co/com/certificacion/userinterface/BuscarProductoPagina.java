package co.com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarProductoPagina extends  Object{

    public static final Target TXT_BUSCADOR = Target.the("Buscador pagina falabella")
            .located(By.xpath("//input[@id='testId-SearchBar-Input']"));

    public static final Target BTN_BUSCAR = Target.the("boton buscar")
            .located(By.xpath("//img[contains(@src,'https://images.falabella.com/v3/assets/blt088e6fffbba20f16/blte9c20b98d24f1a25/60376c9a4a75a66ee92262d6/searcher-glass.svg')]"));

    public static final Target SELECTIONAR_PRODUCTO = Target.the("Producto")
            .located(By.xpath("//b[contains(@id,'testId-pod-displaySubTitle-61897888')]"));



}
