package retos;

import java.util.Scanner;
class Reto3{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CONTRA_OK = "programacion101";
        String contUsu;
        boolean acertado = false; //garantiza un primer intento
        while (!acertado) {
            System.out.println("Introduce contraseña");
            contUsu= sc.nextLine();
            acertado = contUsu.equals(CONTRA_OK);
            if (!acertado) {
                System.out.println("Vuelve a intentarlo");
            }
        }
        System.out.println("Acceso concedido");

    }
}