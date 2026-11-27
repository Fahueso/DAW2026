package UD4;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    static void main() {
        Map<String,String> diccionario = new HashMap<>();
        //insertar con put
        diccionario.put("casa", "Morada de una persona");
        diccionario.put("moto", "Vehiculo de dos ruedas");
        diccionario.put("dinero", "Bien para adquirir cosas");
        //sobreescribir
        diccionario.put("casa", "Construcción utilizada como vivienda");
        //revisar una definicion
        System.out.println("La definición de casa es " + diccionario.get("casa"));
        System.out.println(diccionario.size()); //3 elementos
        diccionario.remove("dinero");

        diccionario.clear(); //borrar todo

    }
}
