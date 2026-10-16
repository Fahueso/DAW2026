import java.util.Scanner;

public class Metodos2 {
    public static void main() {
        double ejemplo1 = Math.pow(5.0,3.0); //método public static double pow(double a, double b)
        System.out.println(ejemplo1);
        //también hay métodos que no son static, pero ahora no los estudiamos
        //Scanner sc = new Scanner(System.in);
        //int ejemplo2 = sc.nextInt(); //método public int nextInt()
        int ejemplo2 = sumar(2,3);
        System.out.println(ejemplo2);


    }

    public static int sumar (int sumando1, int sumando2){
        return sumando1 + sumando2;
    }

}
