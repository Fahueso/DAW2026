package UD4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * EXAMEN PARTE 2: ANÁLISIS DE DATOS DINÁMICOS (ArrayList)
 *
 * OBJETIVO:
 * Gestionar una cesta de la compra mediante TRES ArrayLists PARALELOS:
 * la posición i de cada lista describe el MISMO producto
 * (nombres.get(i), precios.get(i) y cantidades.get(i)).
 * NO se pueden modificar las firmas de los métodos ni el método main.
 * No se permite usar arrays ni otras colecciones auxiliares.
 *
 * ============================================================================
 * 2.1 ELIMINAR PRODUCTOS AGOTADOS (1 pt)
 * ============================================================================
 * eliminarProductosAgotados(nombres, precios, cantidades):
 *  - Elimina de LAS TRES listas todos los productos cuya cantidad sea 0.
 *  - Es OBLIGATORIO recorrer con un Iterator<Integer> sobre 'cantidades'
 *    y borrar con it.remove(). No vale un for con remove(i).
 *  - Las listas deben quedar sincronizadas: mismo tamaño y mismo orden
 *    relativo para los productos que permanecen.
 *  - Mientras recorres, lleva un contador de posición (int indice) que solo
 *    avanza cuando NO se elimina nada. Cuando elimines, borra también
 *    nombres.remove(indice) y precios.remove(indice).
 *    CUIDADO: 'indice' es un int, así que remove(int) borra por POSICIÓN
 *    (no por valor). Así funciona en las listas de Integer.
 *
 *  Ejemplo (antes y después de limpiar):
 *     ANTES:   nombres   = [Producto A, Producto B, Producto C, Producto D]
 *              precios   = [10, 50, 5, 100]
 *              cantidades= [12, 1, 0, 1]
 *     DESPUÉS: nombres   = [Producto A, Producto B, Producto D]
 *              precios   = [10, 50, 100]
 *              cantidades= [12, 1, 1]
 *
 * ============================================================================
 * 2.2 MÉTODOS DE CÁLCULO (3 pts, 1 pt cada uno)
 * ============================================================================
 * Todos se ejecutan DESPUÉS de la limpieza. Los precios son enteros (euros).
 *
 *  - calcularTotal(precios, cantidades): devuelve la suma de
 *    precio * cantidad de todos los productos. Si no hay productos, 0.
 *        Ejemplo con los datos de arriba: 10*12 + 50*1 + 100*1 = 270
 *
 *  - obtenerProductoCaro(nombres, precios): devuelve el NOMBRE del producto
 *    con el precio unitario más alto. Si hay empate, el que aparezca primero.
 *    Si la lista está vacía, devuelve "Ninguno".
 *        Ejemplo con los datos de arriba: "Producto D" (precio 100)
 *
 *  - obtenerMayorGasto(nombres, precios, cantidades): devuelve el NOMBRE del
 *    producto cuyo gasto (precio * cantidad) es mayor. Si hay empate, el
 *    primero. Si la lista está vacía, devuelve "Ninguno".
 *        Ejemplo con los datos de arriba: "Producto A" (gasto 120)
 *    (Observa que NO coincide con el producto más caro: son cosas distintas.)
 *
 * ============================================================================
 * 2.3 COORDINACIÓN: analizarCesta (parte de la nota de los apartados anteriores)
 * ============================================================================
 * analizarCesta debe, por este orden:
 *   1. Llamar a eliminarProductosAgotados.
 *   2. Imprimir el número de productos que quedan en la cesta.
 *   3. Imprimir el total, el producto más caro y el de mayor gasto,
 *      usando los métodos del apartado 2.2.
 *
 * SALIDA ESPERADA con los datos de prueba del main (el programa completo):
 *
 *   === SISTEMA DE ANÁLISIS DE COMPRAS ===
 *
 *   --- Iniciando Procesamiento ---
 *   Productos en la cesta tras la limpieza: 3
 *   Total de la compra: 270 euros
 *   Producto mas caro: Producto D
 *   Producto con mayor gasto: Producto A
 *
 * Caso límite (todas las cantidades a 0): tras la limpieza las listas quedan
 * vacías y la salida debe ser:
 *
 *   --- Iniciando Procesamiento ---
 *   Productos en la cesta tras la limpieza: 0
 *   Total de la compra: 0 euros
 *   Producto mas caro: Ninguno
 *   Producto con mayor gasto: Ninguno
 *
 * PISTAS:
 *  - Para el máximo: guarda en una variable el ÍNDICE del mejor candidato
 *    y compáralo con cada posición; al final devuelve nombres.get(indice).
 *  - Para comparar con '>' estrictamente, el primero en empate se conserva.
 *
 * VALORACIÓN:
 * - Eliminación con Iterator y Sincronía: 1.0 pts
 * - Métodos de Cálculo (Total, Caro, Mayor Gasto): 3.0 pts (1 pt cada uno)
 */
public class ExamenCesta {

    public static void main(String[] args) {
        System.out.println("\n=== SISTEMA DE ANÁLISIS DE COMPRAS ===");

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> precios = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        // Datos de prueba: Producto C está agotado (stock 0) para probar el Iterator.
        // Producto A tiene el mayor gasto (10*12=120) y Producto D el precio más alto (100).
        nombres.add("Producto A"); precios.add(10); cantidades.add(12);
        nombres.add("Producto B"); precios.add(50); cantidades.add(1);
        nombres.add("Producto C"); precios.add(5);  cantidades.add(0);
        nombres.add("Producto D"); precios.add(100); cantidades.add(1);

        analizarCesta(nombres, precios, cantidades);
    }

    public static void analizarCesta(ArrayList<String> nombres, ArrayList<Integer> precios, ArrayList<Integer> cantidades) {
        System.out.println("\n--- Iniciando Procesamiento ---");

        // 1. Limpiar agotados
        eliminarProductosAgotados(nombres, precios, cantidades);

        // 2. Realizar cálculos e imprimir (formato exacto en el enunciado)
        System.out.println("Productos en la cesta tras la limpieza: " + nombres.size());
        System.out.println("Total de la compra: " + calcularTotal(precios, cantidades) + " euros");
        System.out.println("Producto mas caro: " + obtenerProductoCaro(nombres, precios));
        System.out.println("Producto con mayor gasto: " + obtenerMayorGasto(nombres,precios, cantidades));


    }

    public static void eliminarProductosAgotados(ArrayList<String> nombres, ArrayList<Integer> precios, ArrayList<Integer> cantidades) {
        // TODO: Implementar Iterator para eliminar elementos con cantidad == 0
        Iterator<Integer> it = cantidades.iterator();
        int indice=0;

        while (it.hasNext()){
            int cantidad = it.next();
            if (cantidad==0){
                it.remove();
                nombres.remove(indice);
                precios.remove(indice);
            } else {
                indice ++;
            }

        }


    }

    public static int calcularTotal(ArrayList<Integer> precios, ArrayList<Integer> cantidades) {
        // TODO: sumar precio * cantidad de todos los productos.
        int suma=0;
        for(int i=0; i<precios.size(); i++) {
            suma += precios.get(i) * cantidades.get(i);
        }
        return suma;
    }

    public static String obtenerProductoCaro(ArrayList<String> nombres, ArrayList<Integer> precios) {
        // TODO: nombre del producto con mayor precio unitario ("Ninguno" si no hay productos).
        String producto = "Ninguno";
        int precioMayor = -1;
        for (int i = 0; i < precios.size(); i++) {
            if (precios.get(i) > precioMayor) {
                precioMayor = precios.get(i);
                producto = nombres.get(i);
            }
        }

        return producto;
    }

    public static String obtenerMayorGasto(ArrayList<String> nombres, ArrayList<Integer> precios, ArrayList<Integer> cantidades) {
        // TODO: nombre del producto con mayor (precio * cantidad) ("Ninguno" si no hay productos).
        String producto = "Ninguno";
        int gastoMayor = -1;

        for (int i = 0; i < precios.size(); i++) {
            int gasto = precios.get(i) * cantidades.get(i);
            if (gasto > gastoMayor) {
                gastoMayor = gasto;
                producto = nombres.get(i);
            }
        }
        return producto;
    }
}