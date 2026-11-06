package UD4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamenUD3ArrayList {
    static void main() {
        ArrayList<Integer> temperaturas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion=0; 
        do {
            imprimirMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:registrarTemperatura(sc, temperaturas);break;
                case 2: temperaturas.clear();break;
                case 3: imprimirTemperaturas(temperaturas);break;
                case 4:
                    imprimirTemperaturaMax(temperaturas);
                    imprimirTemperaturaMin(temperaturas);
                    break;
                case 5:imprimirTemperaturaMedia(temperaturas);break;
                case 6:System.out.println("Saliendo...");break;
                default:System.out.println("Opcion incorrecta");break;
            }
        }while (opcion!=6);

    }

    private static void imprimirMenu() {
    }

    private static void imprimirTemperaturaMedia(ArrayList<Integer> temperaturas) {
        
    }

    private static void imprimirTemperaturaMin(ArrayList<Integer> temperaturas) {
    }

    private static void imprimirTemperaturaMax(ArrayList<Integer> temperaturas) {
    }

    private static void imprimirTemperaturas(ArrayList<Integer> temperaturas) {
    }

    private static void registrarTemperatura(Scanner sc, ArrayList<Integer> temperaturas) {
    }
}
