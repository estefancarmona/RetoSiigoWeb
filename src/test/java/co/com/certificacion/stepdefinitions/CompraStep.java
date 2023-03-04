package co.com.certificacion.stepdefinitions;

import co.com.certificacion.models.DataProducto;
import co.com.certificacion.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class CompraStep {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) ingreso al navegador$")
    public void queElUsuarioIngresoAlNavegador(String cliente) {
        OnStage.theActorCalled(cliente).wasAbleTo(
                AbrirPaginaDe.google());
    }


    @Y("^busca la pagina de falabella$")
    public void buscaLaPaginaDeFalabella() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                BuscarTienda.falabella());
    }

    @Y("^realiza la busqueda del producto a comprar$")
    public void realizaLaBusquedaDelProductoAComprar(List<Map<String, Object>> dataProducto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CargaDatos.con(dataProducto),
                BuscarProducto.con(DataProducto.info()));

    }

    @Cuando("^agrega el producto a la bolsa de compra$")
    public void agregaElProductoALaBolsaDeCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregaProducto.bolsa());
    }

    @Cuando("^aumenta la cantidad del producto$")
    public void aumentaLaCantidadDelProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CantidadProducto.dos());
    }

    @Cuando("^extiende la garantia del producto$")
    public void extiendeLaGarantiaDelProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Garantia.extendida());
    }

    @Entonces("^se valida el resumen de la compra$")
    public void seValidaElResumenDeLaCompra() {

    }



}
