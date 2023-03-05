package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.DetalleProductoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certificacion.userinterface.DetalleProductoPagina.*;

public class Garantia implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GARANTIA),
                Click.on(BTN_BOLSA_COMPRA),
                Click.on(BTN_RESUMEN_COMPRA));
    }


    public static Garantia extendida(){
        return Tasks.instrumented(Garantia.class);
    }
}
