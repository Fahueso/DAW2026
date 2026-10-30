package retos;

import java.util.Scanner;
public class Reto7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuanto quieres el cuadro?");
        int cuadrado = sc.nextInt();

        for (int i = 0; i < cuadrado; i++) {
            for (int j = 0; j < cuadrado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}