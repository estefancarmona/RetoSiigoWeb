package co.com.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.certificacion.userinterface.BuscarPagina.*;
import static co.com.certificacion.utils.ConstantesTrasversales.PAGINA_FALABELLA;


public class BuscarTienda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(PAGINA_FALABELLA).into(TXT_FALABELLA).thenHit(Keys.ENTER),
                Click.on(BTN_FALABELLA));
    }


    public static BuscarTienda falabella() {
        return new BuscarTienda();
    }
}
