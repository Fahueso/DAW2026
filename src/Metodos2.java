import java.util.Scanner;

public class Metodos2 {
    public static void main() {
        double ejemplo1 = Math.pow(5.0,3.0); //método public static double pow(double a, double b)
        System.out.println(ejemplo1);
        //también hay métodos que no son static, pero ahora no los estudiamos
        //Scanner sc = new Scanner(System.in);
        //int ejemplo2 = sc.nextInt(); //método public int nextInt()
        int ejemplo2 = sumar(2,3);
        System.out.println(ejemplo2); //5
        System.out.println(multiplicar(2,3)); //6
        System.out.println(dividir(14,0)); // 14 -> usará el parche cutre
    }
    public static int sumar (int op1, int op2){
        return op1 + op2;
    }
    public static int multiplicar (int op1, int op2){
        return op1 * op2;
    }
    public static int dividir(int op1, int op2){
        if (op2==0){
            System.out.println("Valor incorrecto. Te lo cambio por un 1");
            op2=1; //parche cutre
        }
        return op1 / op2;
    }

}
