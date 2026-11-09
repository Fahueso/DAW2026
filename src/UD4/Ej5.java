package UD4;

import java.util.ArrayList;

public class Ej5 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul"); //este es el que cambiaremos
        lista.set(2, "Negro"); // Azul -> Negro
        System.out.println(lista);
    }
}
