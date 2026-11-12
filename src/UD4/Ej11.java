package UD4;

import java.util.ArrayList;
import java.util.Collections;

public class Ej11 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Blanco");

        Collections.shuffle(lista);
        System.out.println(lista);
        Collections.shuffle(lista);
        System.out.println(lista);
        Collections.shuffle(lista);
        System.out.println(lista);
        Collections.shuffle(lista);
        System.out.println(lista);
    }
}
