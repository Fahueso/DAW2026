package UD4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej8 {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Blanco");

        //borrar si es blanco

        Iterator<String> it = lista.iterator();

        while(it.hasNext()){
            String dato = it.next();
            if (dato.equals("Blanco")){
                it.remove();
            }
        }
        System.out.println(lista);

    }
}
