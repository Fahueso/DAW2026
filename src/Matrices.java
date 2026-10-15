public class Matrices {
    static void main() {
        int[][] matriz = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        System.out.println(matriz[1][1]);
        System.out.println(matriz[2][0]);
        int[][] matriz2 = new int[3][3];
        matriz2[0][0]=1;
        matriz2[1][0]=2;
        matriz2[2][0]=3;
        matriz2[0][1]=4;
        matriz2[1][1]=5;
        matriz2[2][1]=6;
        matriz2[0][2]=7;
        matriz2[1][2]=8;
        matriz2[2][2]=9;
    }
}
