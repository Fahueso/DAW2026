package UD4;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteradores {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Negro");
        lista.add("Amarillo");

        System.out.println(lista);

        //borrar aquellos cuya length < 5

        // Esta manera dara error: ava.util.ConcurrentModificationException
//        for (String color:lista){
//            if (color.length()<5){
//                lista.remove(color);
//            }
//        }

        //forma correcta
        Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            String color = it.next();
            if (color.length()<5){
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
