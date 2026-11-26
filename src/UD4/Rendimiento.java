package UD4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Rendimiento {

    public static void main(String[] args) {
        // Cantidad de elementos para la prueba
        final int CANTIDAD = 100_000;

        // CAMBIA AQUÍ: new ArrayList<>() por new LinkedList<>()
        List<Integer> lista = new ArrayList<>();

        System.out.println("Probando rendimiento con: " + lista.getClass().getSimpleName());
        System.out.println("Cantidad de elementos: " + CANTIDAD + "\n");

        // 1. Añadir elementos al final
        long inicio = System.nanoTime();
        for (int i = 0; i < CANTIDAD; i++) {
            lista.add(i);
        }
        long fin = System.nanoTime();
        imprimirTiempo("1. Añadir al final (add)", inicio, fin);

        // 2. Leer elementos por índice (Acceso aleatorio)
        inicio = System.nanoTime();
        for (int i = 0; i < CANTIDAD; i++) {
            int elemento = lista.get(i);
        }
        fin = System.nanoTime();
        imprimirTiempo("2. Leer por índice (get)", inicio, fin);

        // 3. Insertar elementos al principio (índice 0)
        inicio = System.nanoTime();
        for (int i = 0; i < CANTIDAD; i++) {
            lista.add(0, i);
        }
        fin = System.nanoTime();
        imprimirTiempo("3. Insertar al principio (add(0, e))", inicio, fin);

        // 4. Eliminar elementos desde el principio (índice 0)
        inicio = System.nanoTime();
        for (int i = 0; i < CANTIDAD; i++) {
            lista.remove(0);
        }
        fin = System.nanoTime();
        imprimirTiempo("4. Eliminar al principio (remove(0))", inicio, fin);
    }

    // Método auxiliar para convertir nanosegundos a milisegundos
    private static void imprimirTiempo(String operacion, long inicio, long fin) {
        double milisegundos = (fin - inicio) / 1_000_000.0;
        System.out.printf("%-38s : %.2f ms%n", operacion, milisegundos);
    }
}

