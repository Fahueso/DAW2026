package UD4;

import java.util.ArrayList;
import java.util.Collections;

public class Ej10 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Blanco");

        ArrayList<String> lista2 = new ArrayList<>();

        for (String dato:lista){
            lista2.add(dato);
        }
        System.out.println(lista2);

        ArrayList<String> lista3 = new ArrayList<>(lista);
        System.out.println(lista3);

        ArrayList<String> lista4 = new ArrayList<>();
        lista4.addAll(lista);


    }
}
