import java.util.Scanner;

public class Metodos3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a=0, b=0, opcion=0;
        boolean inicializado=false;
        //bucle externo
        do{
            imprimirMenu();
            System.out.println("Dime la opción elegida");
            opcion = sc.nextInt();
            sc.nextLine();

        }while(opcion!=6);


    }

    public static void imprimirMenu(){
        System.out.println("Elige una opción");
        System.out.println("1-Introducir a,b");
        System.out.println("2-Sumar");
        System.out.println("3-Restar");
        System.out.println("4-Multiplicar");
        System.out.println("5-Dividir");
        System.out.println("6-Salir");
    }
    public static int sumar(int op1,int op2){
        return op1+op2;
    }
}
