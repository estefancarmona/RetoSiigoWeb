package co.com.certificacion.tasks;

import co.com.certificacion.interactions.CargarData;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

public class CargaDatos {

    public static CargarData con(List<Map<String, Object>> dataProducto) {
        return Tasks.instrumented(CargarData.class, dataProducto);
    }
}
