package co.com.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.certificacion.userinterface.ResumenCompraPagina.PRECIO;


public class ValidacionPrecio implements Question<Boolean> {

    private final String precio;

    public ValidacionPrecio(String precio) {
        this.precio = precio;
    }

    @Subject("validacion valor a pagar")
    @Override
    public Boolean answeredBy(Actor actor) {

        String validacion = PRECIO.resolveFor(actor).getTextValue();
        return precio.equals(validacion);
    }

    public static ValidacionPrecio producto(String validacion) {
        return new ValidacionPrecio(validacion);
    }
}
