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
            sc.nextLine();
            switch (opcion) {
                case 1:registrarTemperatura(sc, temperaturas);break;
                case 2: limpiarTemperaturas(sc, temperaturas);break;
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

    private static void limpiarTemperaturas(Scanner sc, ArrayList<Integer> temperaturas) {
        char confirmacion;
        System.out.println("Seguro que quiere borrar s/n");
        confirmacion = sc.nextLine().toLowerCase().charAt(0);
        if (confirmacion=='s'){
            temperaturas.clear();
        }

    }


    private static void imprimirMenu() {
        System.out.println("""
                1 - Registrar
                2 - Limpiar
                3 - Imprimir
                4 - Max y Min
                5 - Promedio
                6 - Salir
                """);
    }

    private static void imprimirTemperaturaMedia(ArrayList<Integer> temperaturas) {
        
    }

    private static void imprimirTemperaturaMin(ArrayList<Integer> temperaturas) {
    }

    private static void imprimirTemperaturaMax(ArrayList<Integer> temperaturas) {
        if (!temperaturas.isEmpty()) {
            int max = temperaturas.getFirst();
            for (Integer temp : temperaturas) {
                if (max < temp) {
                    max = temp;
                }
            }
            System.out.println("La temp máx es " + max);
        } else {
            System.out.println("No hay temperaturas");
        }
    }

    private static void imprimirTemperaturas(ArrayList<Integer> temperaturas) {
        if (temperaturas.size()>0) { // igual que if(temperaturas.isEmpty())
            System.out.println("Temperaturas:");
            for (Integer temp : temperaturas) {
                System.out.print(temp + " - ");
            }
        } else {
            System.out.println("No hay temperaturas registradas");
        }
        System.out.println();
    }

    private static void registrarTemperatura(Scanner sc, ArrayList<Integer> temperaturas) {
        int veces = 0;
        int temp= 0;
        System.out.println("Cuantas muestras deseas tomar");
        veces = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<veces;i++){
            System.out.println("Dime temperatura  " + i);
            temp = sc.nextInt();
            sc.nextLine();
            if (temp >= -273) {
                //introducimos el valor en el arraylist
                temperaturas.add(temp);
            } else {
                System.out.println("Temperatura fuera de rango. No la introducimos");
            }
        }
    }
}
