package UD4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        System.out.println(diccionario.size());
        diccionario.remove("dinero");

        //imprimir todo mi vocabulario
        System.out.println("Imprimiendo vocabulario");
        Set<String> vocabulario = diccionario.keySet();
        for(String palabra:vocabulario){
            System.out.println(palabra);
        }

        //imprimir el diccionario entero con formato clave => valor
        System.out.println("Imprimiendo todo el diccionario gracias al vocabulario");
        for(String palabra:vocabulario){
            System.out.println(palabra + " => " + diccionario.get(palabra));

        }



        diccionario.clear(); //borrar todo

    }
}
