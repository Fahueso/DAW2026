package UD4;

import java.util.ArrayList;
import java.util.Arrays;

public class Climograma {
    static void main() {
        Integer[] temp = {12, 14, 13, 15, 17, 21, 24, 26, 22, 17, 15, 14};
        ArrayList<Integer> temperaturas = new ArrayList<>(Arrays.asList(temp));
        String[][] meses = {
                {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"},

                {"January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"},

                {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
                        "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"}
        };

        System.out.println("Seleccione idioma (1. Español, 2. Inglés, 3. Francés): 1");
        int opcion = 1;

        for (int i=0;i< meses[opcion].length;i++){
            String linea = obtenerLineaTemperatura(temperaturas.get(i));
            //String linea = "*********** (12)";
            System.out.printf("%-10s : %s %n", meses[opcion][i], linea);
//          System.out.println(meses[opcion][i] + ":" + linea);
        }

}

    private static String obtenerLineaTemperatura(Integer cantidad) {
        String linea = "";
        for (int i=0;i<cantidad;i++ )
            linea += "*";
        linea += " (" + cantidad + ")";
        return linea;
    }


}
