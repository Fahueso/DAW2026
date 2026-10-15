public class Matrices2 {
    public static void main() {
        int[][] matriz = {
                {1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 9, 12}
        };

        //matriz.length tiene número de filas
        for (int i = 0; i < matriz.length; i++){//0,1,2
            //todas las filas, tienen las mismas columnas
            //matriz[i].length -> tamaño siguiente dimensión
            for (int j=0; j < matriz[i].length; j++){ //0,1,2,3
                System.out.print(matriz[i][j] + " ");
            }

        }
    }
}
