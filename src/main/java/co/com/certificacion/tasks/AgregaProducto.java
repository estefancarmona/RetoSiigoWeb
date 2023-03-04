package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.DetalleProductoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class AgregaProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DetalleProductoPagina.BTN_AGREGAR));
    }


    public static AgregaProducto bolsa(){
        return Tasks.instrumented(AgregaProducto.class);
    }
}
