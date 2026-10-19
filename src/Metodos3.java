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
            switch (opcion){
                case 1:
                    //leer a y b
                    System.out.println("Introduce a:");
                    a=sc.nextInt();
                    System.out.println("Introduce b:");
                    b=sc.nextInt();
                    inicializado=true;
                    break;
                case 2:
                    if (inicializado) System.out.println(sumar(a,b));
                    break;
                case 3:
                    if (inicializado) System.out.println(restar(a,b));
                     break;
                case 4:
                    if (inicializado) System.out.println(multiplicar(a,b));
                    break;
                case 5:
                    if (inicializado) System.out.println(dividir(a,b));
                    break;
                case 6:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Elige una op correcta");
                    break;
            }

        }while(opcion!=6);


    }

    private static int dividir(int a, int b) {
        if (b!=0)
            return a/b;
        else{
            System.out.println("Has pasado un 0. Te devuelvo 0");
            return 0;
        }
    }

    private static int multiplicar(int a, int b) {
        return a*b;
    }

    private static int restar(int a, int b) {
        return a-b;
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
