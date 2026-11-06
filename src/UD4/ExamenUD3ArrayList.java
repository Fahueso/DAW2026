package UD4;

import java.util.ArrayList;
import java.util.Collections;

public class ExamenUD3ArrayList {
    static void main() {
        ArrayList<Integer> temperaturas = new ArrayList<>();

        //opcion 1
        temperaturas.add(10);
        temperaturas.add(12);

        // opcion2
        System.out.print("Temperaturas: ");
        for (Integer temp: temperaturas){
            System.out.print(temp + " - ");
        }

        //opcion3
        temperaturas.clear();

        //volvemos a meter valores para que no falle max y min
        temperaturas.add(10);
        temperaturas.add(12);

        //opcion4
        int max=0, min=Integer.MAX_VALUE;
//        for (Integer temp: temperaturas){
//            if (temp > max)
//                max = temp;
//        }
        max = Collections.max(temperaturas);
        min = Collections.min(temperaturas);
        System.out.println("Max:" + max + " Min: "+ min);

    }
}
