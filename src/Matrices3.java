public class Matrices3 {
    public static void main() {
        //no va para examen
        int[][][] matriz = {
                {{1,2}, {7,8}, {12,13}, {18,19}},
                {{3,4}, {9,10}, {14,15}, {20,21}},
                {{5,6}, {11,12}, {16,17}, {22,23}}
        };

        //matriz.length tiene número de filas
        for (int i = 0; i < matriz.length; i++){
            //todas las filas, tienen las mismas columnas
            //matriz[i].length -> tamaño siguiente dimensión
            for (int j=0; j < matriz[i].length; j++){
                   for (int k=0; k < matriz[i][j].length; k++) { //0,1,2,3
                       System.out.print(matriz[i][j][k] + " ");
                   }
            }

        }
    }
}
