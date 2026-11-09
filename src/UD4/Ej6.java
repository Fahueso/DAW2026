package UD4;

import java.util.ArrayList;

public class Ej6 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul"); //este es el que cambiaremos
        lista.remove(2); //azul eliminado
        System.out.println(lista);
    }
}
