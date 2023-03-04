package co.com.certificacion.tasks;

import co.com.certificacion.userinterface.AbrirNavegador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaDe implements Task {

   private AbrirNavegador abrirNavegador;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirNavegador));
    }

    public static AbrirPaginaDe google(){
        return Tasks.instrumented(AbrirPaginaDe.class);
    }


}
