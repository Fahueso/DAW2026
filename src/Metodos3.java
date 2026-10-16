import java.util.Scanner;

public class Metodos3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a=5, b=6;
        imprimirMenu();
        int opcion = sc.nextInt();
        switch (opcion){
            case 2:
                System.out.println(sumar(a,b));
                break;
        }

    }

    public static void imprimirMenu(){
        System.out.println("Elige una opción");
        System.out.println("1-Introducir a,b");
        System.out.println("2-Sumar");
        System.out.println("6-Salir");
    }
    public static int sumar(int op1,int op2){
        return op1+op2;
    }
}
