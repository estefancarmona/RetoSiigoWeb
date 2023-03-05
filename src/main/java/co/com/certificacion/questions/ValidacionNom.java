package co.com.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.certificacion.userinterface.ResumenCompraPagina.PRODUCTO;


public class ValidacionNom implements Question<Boolean> {

    private final String producto;

    public ValidacionNom(String producto) {
        this.producto = producto;
    }

    @Subject("validacion producto agregado al carrito")
    @Override
    public Boolean answeredBy(Actor actor) {

        String validacion = PRODUCTO.resolveFor(actor).getTextValue();
        return producto.equals(validacion);
    }

    public static ValidacionNom producto(String validacion) {
        return new ValidacionNom(validacion);
    }
}
