package UD4;

import java.util.ArrayList;

public class Ej13 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Blanco");

        ArrayList<String> lista2 = new ArrayList<>(lista.subList(0,2));
        ArrayList<String> lista3 =  new ArrayList<>(lista.subList(2,4));
        System.out.println(lista2);//Rojo - Verde
        System.out.println(lista3); // Azul y blanco

    }
}
