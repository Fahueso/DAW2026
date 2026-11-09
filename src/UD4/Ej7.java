package UD4;

import java.util.ArrayList;

public class Ej7 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul"); //este es el que cambiaremos
        //buscar uno que no exista
        String buscado = "Blanco";
        if (lista.contains(buscado)){
            System.out.println("Encontrado");
        } else{
            System.out.println("No encontrado");
        }
    }
}
