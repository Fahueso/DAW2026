public class arrayParametro {
    static void main() {
        int[] array1 = {1,2,3,4};
        int[] array2 = {7,6,5,4};
        imprimirArray(array1);
        duplicarArray(array1); //cambiará el array1
        imprimirArray(array1);
        int array3[] = suma(array1, array2);
        imprimirArray(array3);
        invertir(array1); //cambia de signo todos los valores
        imprimirArray(array1);

    }

    public static void invertir(int[] arrayParametro) {
        for(int i=0;i<arrayParametro.length;i++){
            arrayParametro[i]*=-1;//arrayParametro[i]=arrayParametro[i]*-1

        }
    }

    public static int[] suma(int[] array1, int[] array2) {
        int[] nuevo = new int[array1.length];
        //sumar
        for (int i=0;i<array1.length;i++){
            nuevo[i]=array1[i]+array2[i];
        }

        return nuevo;
    }

    public static void imprimirArray(int[] arrayParametro){
        for(int i=0;i<arrayParametro.length;i++){
            System.out.print(arrayParametro[i] + " ");
        }
        System.out.println();//para separar una linea
    }

    public static void duplicarArray(int[] arrayParametro) {
        for(int i=0;i<arrayParametro.length;i++){
            arrayParametro[i]*=2;//arrayParametro[i]=arrayParametro[i]*2

        }
    }
}
