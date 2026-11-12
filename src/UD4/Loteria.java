package UD4;

import java.util.ArrayList;
import java.util.Collections;

public class Loteria {
    static void main() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i=0; i<= 99999; i++){
            numeros.add(i);
        }
        Collections.shuffle(numeros);

        ArrayList<Integer> premios = new ArrayList<>();
        for (int i=0; i<= 1000; i++){
            premios.add(100);
        }
        for (int i=0; i<= 1000; i++){
            premios.add(10000);
        }
        Collections.shuffle(premios);

        for (int i=0;i<premios.size();i++){
            int premio = premios.get(i);
            int numero = numeros.get(i);
            System.out.println("Al numero " + numero + " le toco " + premio);
        }



    }
}
