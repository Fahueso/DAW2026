package retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                            
                            === MENU ===
                        1. Atacar
                        2. Defender
                        3. Usar Poción
                        4. Salir del juego
                    """);

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Has atacado");
                    break;
                case 2:
                    System.out.println("Has defendido");
                    break;
                case 3:
                    System.out.println("Has usado una poción");
                    break;
                case 4:
                    System.out.println("Has salido del juego");
                    break;
                default:
                    System.out.println("Elige una opción correcta");
                    break;
            }
        }while (opcion != 4);
    }
}
