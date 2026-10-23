import java.util.Scanner;

public class Cine {
    public static void main() {
        char[] asientos = new char[15];
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        inicializarAsientos(asientos,'o');
        do{
            imprimirMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    comprobarDisponibilidad(asientos);
                    break;
                case 2:
                    reservarAsiento(sc, asientos);
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opcion!=3);


    }

    private static void reservarAsiento(Scanner sc, char[] asientos) {
        int pos =0;
        System.out.println("Indica qué asiento quieres reservar");
        System.out.println("Del número 0 al " + asientos.length);
        pos = sc.nextInt();

        if (asientos[pos]=='o'){
            System.out.println("Reservado");
            asientos[pos]='x';
        } else {
            System.out.println("El asiento estaba ocupado. Revise la disponibilidad");
        }


    }

    private static void comprobarDisponibilidad(char[] asientos) {
        imprimirArray(asientos,"Estado de los asientos");
    }

    private static void imprimirMenu() {
        System.out.println("Cine Sagunto");
        System.out.println("Elige una opción");
        System.out.println("1 - Comprobar disponibilidad");
        System.out.println("2 - Reservar");
        System.out.println("3 - Salir");
    }

    private static void inicializarAsientos(char[] asientos, char letra) {
        for(int i=0;i<asientos.length;i++){
            asientos[i]=letra;
        }
    }

    public static void imprimirArray(char[] array, String mensaje){
        System.out.println(mensaje);
        imprimirArray(array);
    }

    public static void imprimirArray(char[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
