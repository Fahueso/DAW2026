package simulacro;

import java.util.Scanner;

public class AnalisisAnual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // ================= MÉTODO =================
        // static int leerNumeroMeses(Scanner sc)
        // Lee un entero validado entre 1 y 12 y lo devuelve.
        // ==========================================
        System.out.print("¿Cuántos meses quieres analizar (1-12)? ");
        int numMeses = sc.nextInt();
        sc.nextLine();
        while (numMeses < 1 || numMeses > 12) {
            System.out.print("Debe estar entre 1 y 12. ¿Cuántos meses? ");
            numMeses = sc.nextInt();
            sc.nextLine();
        }

        // ================= MÉTODO (DUPLICADO abajo) =================
        // static double[] leerArray(Scanner sc, int numMeses, String concepto)
        // Lee un array de doubles validado (>= 0) y lo devuelve.
        // Se usa DOS veces: con "Ingresos" y con "Gastos".
        // ==============================================================
        double[] ingresos = new double[numMeses];
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Ingresos de " + meses[i] + ": ");
            ingresos[i] = sc.nextDouble();
            sc.nextLine();
            while (ingresos[i] < 0) {
                System.out.print("No puede ser negativo. Ingresos de " + meses[i] + ": ");
                ingresos[i] = sc.nextDouble();
                sc.nextLine();
            }
        }

        // ================= MISMO MÉTODO leerArray (2ª llamada) =================
        double[] gastos = new double[numMeses];
        for (int i = 0; i < numMeses; i++) {
            System.out.print("Gastos de " + meses[i] + ": ");
            gastos[i] = sc.nextDouble();
            sc.nextLine();
            while (gastos[i] < 0) {
                System.out.print("No puede ser negativo. Gastos de " + meses[i] + ": ");
                gastos[i] = sc.nextDouble();
                sc.nextLine();
            }
        }

        // ================= MÉTODO =================
        // static double[] calcularBeneficio(double[] ingresos, double[] gastos)
        // Devuelve un array con ingresos[i] - gastos[i].
        // ===========================================
        double[] beneficio = new double[numMeses];
        for (int i = 0; i < numMeses; i++) {
            beneficio[i] = ingresos[i] - gastos[i];
        }

        // ================= MÉTODO (DUPLICADO 2 veces abajo) =================
        // static double calcularSuma(double[] arr)
        // Devuelve la suma de todos los elementos del array.
        // Se usa para: ingresos, gastos y beneficio.
        // ===================================================================
        double totalIngresos = 0;
        for (int i = 0; i < numMeses; i++) {
            totalIngresos += ingresos[i];
        }

        // MISMO MÉTODO calcularSuma (2ª llamada)
        double totalGastos = 0;
        for (int i = 0; i < numMeses; i++) {
            totalGastos += gastos[i];
        }

        // MISMO MÉTODO calcularSuma (3ª llamada)
        double totalBeneficio = 0;
        for (int i = 0; i < numMeses; i++) {
            totalBeneficio += beneficio[i];
        }

        // ================= MÉTODO =================
        // static double calcularMedia(double[] arr)
        // Devuelve la media. Puede reutilizar calcularSuma.
        // ===========================================
        double mediaIngresos = totalIngresos / numMeses;
        double mediaGastos = totalGastos / numMeses;
        double mediaBeneficio = totalBeneficio / numMeses;

        // ================= MÉTODO (DUPLICADO 2 veces abajo) =================
        // static int buscarIndiceMaximo(double[] arr)
        // Devuelve la posición del valor máximo.
        // Se usa para: ingresos, gastos y beneficio.
        // =====================================================================
        int posMaxIngresos = 0;
        for (int i = 1; i < numMeses; i++) {
            if (ingresos[i] > ingresos[posMaxIngresos]) posMaxIngresos = i;
        }

        // MISMO MÉTODO buscarIndiceMaximo (2ª llamada)
        int posMaxGastos = 0;
        for (int i = 1; i < numMeses; i++) {
            if (gastos[i] > gastos[posMaxGastos]) posMaxGastos = i;
        }

        // MISMO MÉTODO buscarIndiceMaximo (3ª llamada)
        int posMaxBeneficio = 0;
        for (int i = 1; i < numMeses; i++) {
            if (beneficio[i] > beneficio[posMaxBeneficio]) posMaxBeneficio = i;
        }

        // ================= MÉTODO (DUPLICADO 2 veces abajo) =================
        // static int buscarIndiceMinimo(double[] arr)
        // Devuelve la posición del valor mínimo.
        // Se usa para: ingresos, gastos y beneficio.
        // ====================================================================
        int posMinIngresos = 0;
        for (int i = 1; i < numMeses; i++) {
            if (ingresos[i] < ingresos[posMinIngresos]) posMinIngresos = i;
        }

        // MISMO MÉTODO buscarIndiceMinimo (2ª llamada)
        int posMinGastos = 0;
        for (int i = 1; i < numMeses; i++) {
            if (gastos[i] < gastos[posMinGastos]) posMinGastos = i;
        }

        // MISMO MÉTODO buscarIndiceMinimo (3ª llamada)
        int posMinBeneficio = 0;
        for (int i = 1; i < numMeses; i++) {
            if (beneficio[i] < beneficio[posMinBeneficio]) posMinBeneficio = i;
        }

        // ================= MÉTODO =================
        // static void mostrarTabla(double[] ingresos, double[] gastos,
        //                          double[] beneficio, int numMeses)
        // Imprime la cabecera, las filas y los separadores.
        // ===========================================
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Mes          | Ingresos  | Gastos    | Beneficio");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < numMeses; i++) {
            System.out.printf("%-12s | %9.2f | %9.2f | %9.2f%n",
                    meses[i], ingresos[i], gastos[i], beneficio[i]);
        }
        System.out.println("--------------------------------------------------------------");

        // ================= MÉTODO =================
        // static void mostrarResumen(double[] ingresos, double[] gastos,
        //                            double[] beneficio, int numMeses)
        // Imprime totales, medias y extremos (usando mostrarExtremos).
        // ===========================================
        System.out.println();
        System.out.println("=== RESUMEN ===");
        System.out.printf("Total ingresos:  %.2f%n", totalIngresos);
        System.out.printf("Total gastos:    %.2f%n", totalGastos);
        System.out.printf("Beneficio total: %.2f%n", totalBeneficio);
        System.out.printf("Media ingresos:  %.2f%n", mediaIngresos);
        System.out.printf("Media gastos:    %.2f%n", mediaGastos);
        System.out.printf("Media beneficio: %.2f%n", mediaBeneficio);
        System.out.println();

        // ================= MÉTODO (DUPLICADO 2 veces abajo) =================
        // static void mostrarExtremos(double[] valores,
        //                             String etiquetaMax, String etiquetaMin)
        // Imprime la línea de máximo y mínimo de un array con sus etiquetas.
        // =====================================================================
        System.out.println("Mejor mes en ingresos:  " + meses[posMaxIngresos] + " (" + ingresos[posMaxIngresos] + ")");
        System.out.println("Peor mes en ingresos:   " + meses[posMinIngresos] + " (" + ingresos[posMinIngresos] + ")");
        // MISMO MÉTODO mostrarExtremos (2ª llamada, etiquetas de gastos)
        System.out.println("Mayor gasto:            " + meses[posMaxGastos] + " (" + gastos[posMaxGastos] + ")");
        System.out.println("Menor gasto:            " + meses[posMinGastos] + " (" + gastos[posMinGastos] + ")");
        // MISMO MÉTODO mostrarExtremos (3ª llamada, etiquetas de beneficio)
        System.out.println("Mejor beneficio:        " + meses[posMaxBeneficio] + " (" + beneficio[posMaxBeneficio] + ")");
        System.out.println("Peor beneficio:         " + meses[posMinBeneficio] + " (" + beneficio[posMinBeneficio] + ")");

        // ================= MÉTODO =================
        // static void ordenarPorBeneficio(double[] ingresos, double[] gastos,
        //                                 double[] beneficio, int numMeses)
        // Ordena descendentemente por beneficio.
        // Dentro, extraer el intercambio a:
        //   static void intercambiar(double[] ingresos, double[] gastos,
        //                            double[] beneficio, int i, int j)
        // ===========================================
        for (int i = 0; i < numMeses - 1; i++) {
            for (int j = 0; j < numMeses - 1 - i; j++) {
                if (beneficio[j] < beneficio[j + 1]) {
                    // ---- Esto es intercambiar(...) ----
                    double tI = ingresos[j]; ingresos[j] = ingresos[j + 1]; ingresos[j + 1] = tI;
                    double tG = gastos[j]; gastos[j] = gastos[j + 1]; gastos[j + 1] = tG;
                    double tB = beneficio[j]; beneficio[j] = beneficio[j + 1]; beneficio[j + 1] = tB;
                }
            }
        }

        // ================= MÉTODO =================
        // static void mostrarRanking(double[] beneficio, int numMeses)
        // Imprime los meses ya ordenados con su beneficio.
        // ===========================================
        System.out.println();
        System.out.println("=== RANKING POR BENEFICIO ===");
        for (int i = 0; i < numMeses; i++) {
            System.out.println((i + 1) + ". " + meses[i] + " -> beneficio " + beneficio[i]);
        }

        sc.close();
    }
}