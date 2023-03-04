package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.BuscarProductoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import org.openqa.selenium.Keys;

import java.util.Map;

import static co.com.certificacion.utils.ConstantesTrasversales.PRODUCTO;

public class BuscarProducto implements Task {

    private final Map<String, Object> dataProducto;

    public BuscarProducto(Map<String, Object> dataProducto) {
        this.dataProducto = dataProducto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BuscarProductoPagina.TXT_BUSCADOR),
                Enter.theValue(dataProducto.get(PRODUCTO).toString()).into(BuscarProductoPagina.TXT_BUSCADOR)
                        .thenHit(Keys.ARROW_DOWN),

                Click.on((BuscarProductoPagina.BTN_BUSCAR)),
                Click.on((BuscarProductoPagina.SELECTIONAR_PRODUCTO))

        );
    }


    public static BuscarProducto con(Map<String, Object> dataProducto) {
        return new BuscarProducto(dataProducto);
    }
}
