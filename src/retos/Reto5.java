package retos;

import java.util.Scanner;
public class Reto5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int alumnos;
        double nota,acumulador=0;
        System.out.println("Cuantos alumnos tienes?");
        alumnos = sc.nextInt();

        for (int i = 1; i <= alumnos; i++) {
            System.out.print("Que nota tiene el alumno " + i + ":");
            nota = sc.nextDouble();
            acumulador += nota;
        }
        System.out.println("La media de la clase es:" + (acumulador / (alumnos)));

    }
}