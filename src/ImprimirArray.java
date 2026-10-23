public class ImprimirArray {
    static void main() {
        char[] asientos = {'o','o','o'};
        String[] personas = {"","",""};
        int[] edades = {0,0,0};

        //imprimimos
        imprimirAsientos(asientos);
        imprimirPersonas(personas);
        imprimirEdades(edades);

    }

    private static void imprimirEdades(int[] edades) {
        imprimirArray(edades,"Lista de edades");
    }

    private static void imprimirPersonas(String[] personas) {
        imprimirArray(personas,"Lista de personas");
    }

    public static void imprimirAsientos(char[] array){
        imprimirArray(array, "Lista de asientos");
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

    public static void imprimirArray(String[] array, String mensaje){
        System.out.println(mensaje);
        imprimirArray(array);
    }

    public static void imprimirArray(String[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void imprimirArray(int[] array, String mensaje){
        System.out.println(mensaje);
        imprimirArray(array);
    }

    public static void imprimirArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
