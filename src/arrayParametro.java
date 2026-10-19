public class arrayParametro {
    static void main() {
        int[] array = {1,2,3,4};
        imprimirArray(array);
        duplicarArray(array); //cambiará el array
        imprimirArray(array);

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
