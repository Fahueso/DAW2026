package retos;
import java.util.Scanner;

public class Reto1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int edad ;
        System.out.println("Buenas noches!!");
        System.out.println("Dime tu edad porfavor: " );
        edad = sc.nextInt();

        if (edad>=18){
            System.out.println("Puedes pasar");
        } else if (edad>=16) { //también edad==16 || edad==17
            System.out.println("Puedes pasar, pero solo a la sesión ligth.");
        } else {
            // if (edad<16) { -no hace falta
            System.out.println("No puedes pasar");
        }
    }
}