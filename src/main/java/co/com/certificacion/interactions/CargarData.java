package co.com.certificacion.interactions;

import co.com.certificacion.models.DataProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.annotations.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CargarData implements Interaction {

    private final List<Map<String, Object>> dataProducto;

    public CargarData(List<Map<String, Object>> dataProducto) {
        this.dataProducto = dataProducto;
    }

    @Subject("Se recorre la informacion del feature")
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!dataProducto.isEmpty()) {
            Set<Map.Entry<String, Object>> setMapaAux = dataProducto.get(0).entrySet();
            Map<String, Object> mapAux = setMapaAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if (DataProducto.info() == null) {
                DataProducto.setMap(mapAux);
            } else {
                DataProducto.info().putAll(mapAux);
            }

    }
    }



}
