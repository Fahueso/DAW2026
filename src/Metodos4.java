import java.util.Scanner;

public class Metodos4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,23,4};
        int[] b = {4,5,6};
        int opcion=0;
        do{
            imprimirMenu();
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Sin implementar todavia");
                    break;
                case 2:
                    int[] res = sumar(a,b);
                    imprimirArray(res);
                    break;
                case 3:
                    imprimirArray(restar(a,b)); //método abreviado
                    break;
                case 4:
                    imprimirArray(multiplicar(a,b));
                    break;
                case 5:
                    imprimirArray(dividir(a,b));
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        }while(opcion!=6); //hasta que pulse la opcion 6

    }

    public static void imprimirMenu(){
        System.out.println("Elige una opción con arrays");
        System.out.println("2-Sumar");
        System.out.println("3-Restar");
        System.out.println("4-Multiplicar");
        System.out.println("5-Dividir");
        System.out.println("6-Salir");
    }
    public static void imprimirArray(int[] arrayParametro){
        for(int i=0;i<arrayParametro.length;i++){
            System.out.print(arrayParametro[i] + " ");
        }
        System.out.println();//para separar una linea
    }

    public static int[] sumar(int[] array1, int[] array2) {
        int[] nuevo = new int[array1.length];
        //sumar
        for (int i=0;i<array1.length;i++){
            nuevo[i]=array1[i]+array2[i];
        }

        return nuevo;
    }

    public static int[] restar(int[] array1, int[] array2) {
        int[] nuevo = new int[array1.length];
        //restar
        for (int i=0;i<array1.length;i++){
            nuevo[i]=array1[i]-array2[i];
        }

        return nuevo;
    }

    public static int[] multiplicar(int[] array1, int[] array2) {
        int[] nuevo = new int[array1.length];
        //multiplicar
        for (int i=0;i<array1.length;i++){
            nuevo[i]=array1[i]*array2[i];
        }

        return nuevo;
    }

    public static int[] dividir(int[] array1, int[] array2) {
        int[] nuevo = new int[array1.length];
        //dividir
        for (int i=0;i<array1.length;i++){
            if (array2[i] ==0) {
                nuevo[i] = array1[i];
                System.out.println("El array2 en la posición " + i + " tenía un 0. Pongo 1");
            }
            else {
                nuevo[i] = array1[i] / array2[i];
            }
        }

        return nuevo;
    }

}
