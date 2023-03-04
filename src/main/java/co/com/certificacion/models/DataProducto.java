package co.com.certificacion.models;

import java.util.HashMap;
import java.util.Map;

public class DataProducto {

    private static Map<String, Object> map = new HashMap<>();

    private DataProducto() throws IllegalAccessException {
        throw new IllegalAccessException("Utility Class");
    }

    public static Map<String, Object> info(){
        return map;
    }

    public static void setMap(Map<String, Object> dataProducto){
        map=dataProducto;
    }

    public static String getThe(String getData){
        return (String) info().get(getData);
    }


}
