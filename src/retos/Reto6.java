package retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0;
        String seguir;
        do {
            System.out.println("Dime dos números para sumar");
            num1=sc.nextInt();
            sc.nextLine();
            num2=sc.nextInt();
            sc.nextLine();
            System.out.println("La suma de "+ num1 +" y "+ num2 + " es "+ (num1+num2));
            System.out.println("¿Deseas realizar otra suma? (s/n)");
            seguir= sc.nextLine().toUpperCase();
        } while (!seguir.equals("S"));
    }
}