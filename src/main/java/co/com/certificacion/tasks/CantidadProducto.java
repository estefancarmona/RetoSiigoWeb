package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.DetalleProductoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CantidadProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetalleProductoPagina.BTN_MAS));
    }


    public static CantidadProducto dos(){
        return Tasks.instrumented(CantidadProducto.class);
    }
}
