package UD4;

import java.util.ArrayList;

public class Ej3 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        //insertar al principio amarillo
        lista.add(0, "Amarillo");
        System.out.println(lista);

    }
}
