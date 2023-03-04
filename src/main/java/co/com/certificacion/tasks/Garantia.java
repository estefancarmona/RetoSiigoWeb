package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.DetalleProductoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Garantia implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleProductoPagina.BTN_GARANTIA));
    }


    public static Garantia extendida(){
        return Tasks.instrumented(Garantia.class);
    }
}
