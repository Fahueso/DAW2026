package UD03;

import java.util.Random;
import java.util.Scanner;

/**
 * EXAMEN ORDINARIO - PROGRAMACIÓN
 * PREGUNTA 1 ( puntos): MODULARIZACIÓN Y ESTRUCTURAS DE CONTROL
 *
 * INSTRUCCIONES
 * ------------------------------------------------------------------
 * - Completa únicamente los métodos marcados con TODO.
 * - No modifiques el método main (el menú ya está implementado).
 * - No modifiques las firmas de los métodos.
 * - No crees nuevos Scanner.
 * - Los métodos ejecutar... deben limitarse a coordinar las llamadas
 *   al resto de métodos; no incluya en ellos lógica que pueda
 *   encapsularse en otro método.
 *
 * ==================================================================
 * 1.1 MÁQUINA TRAGAPERRAS (1.5 puntos)
 * ==================================================================
 * Símbolos posibles: "Cereza", "Campana", "Estrella".
 *
 * generarSimbolo()                                        (0,5 pts)
 *   Devuelve aleatoriamente uno de los tres símbolos.
 *
 * calcularPremio(String s1, String s2, String s3)         (0,5 pts)
 *   Devuelve:
 *     "PREMIO MAYOR" si los tres símbolos son iguales.
 *     "PREMIO MENOR" si exactamente dos símbolos son iguales.
 *     "SIN PREMIO"   en cualquier otro caso.
 *
 * ejecutarTragaperras()                                   (0,5 pts)
 *   1. Genera tres símbolos.
 *   2. Los muestra con el formato:  Cereza | Cereza | Estrella
 *   3. Muestra el premio obtenido en la línea siguiente.
 *
 * ==================================================================
 * 1.2 CARRERA DE MASCOTAS (2.5 puntos)
 * ==================================================================
 * La mascota elegida solo sirve para mostrarla por pantalla;
 * no influye en el resultado. El rival se llama siempre "Rival".
 *
 * pedirMascota(Scanner)                                   (ya implementado)
 *   Pide una mascota: Perro, Gato o Conejo.
 *   - Debe leer con scanner.next() (una palabra).
 *   - No distingue mayúsculas de minúsculas ("perro", "PERRO"...).
 *   - Si el valor no es válido muestra exactamente:
 *       Mascota no válida. Inténtalo de nuevo.
 *     y vuelve a pedirla hasta obtener una válida.
 *   - Devuelve el texto normalizado: "Perro", "Gato" o "Conejo".
 *
 * generarAvance()                                         (0,25 pts)
 *   Devuelve un entero aleatorio entre 1 y 6 (ambos incluidos).
 *
 * calcularGanador(int jugador, int rival)                 (0,50 pts)
 *   Devuelve "Jugador", "Rival" o "Empate" según quién tenga
 *   más casillas.
 *
 * ejecutarCarrera(Scanner)                                (1,75 pts)
 *   1. Pide la mascota.
 *   2. Jugador y rival parten de la casilla 0. En cada ronda
 *      ambos avanzan un valor aleatorio entre 1 y 6.
 *   3. Tras cada ronda muestra los avances y las posiciones.
 *   4. La carrera termina cuando alguno alcanza o supera la
 *      casilla 20 (si ambos lo hacen en la misma ronda, gana quien
 *      esté más adelante, y si están igualados, es empate).
 *   5. Muestra el resultado final con uno de estos mensajes:
 *        ¡Victoria del jugador!
 *        ¡Victoria del rival!
 *        ¡Empate!
 *
 * Ejemplo de ronda:
 *
 *   Tu mascota: Perro
 *
 *   Perro avanza 4
 *   Rival avanza 2
 *   Perro: 4
 *   Rival: 2
 *   ...
 *   ¡Victoria del jugador!
 */

public class ExamenPregunta1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Máquina Tragaperras");
            System.out.println("2. Carrera de Mascotas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    ejecutarTragaperras();
                    break;

                case 2:
                    ejecutarCarrera(scanner);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }

    /* ======================================================
       1.1 MÁQUINA TRAGAPERRAS
       ====================================================== */

    public static void ejecutarTragaperras() {

        System.out.println("\n--- MÁQUINA TRAGAPERRAS ---");

        // TODO:
        String a = generarSimbolo();
        String b = generarSimbolo();
        String c = generarSimbolo();

        System.out.println(a + " | " + b + " | " + c);
        String premio = calcularPremio(a,b,c);
        System.out.println(premio);

    }

    public static String generarSimbolo() {

       Random rd = new Random();
       int num = rd.nextInt(3);
//       String[] array = {"Cereza","Campana", "Estrella"};
//       return (array[num]);

        String resultado="Estrella";
       if (num==0)
           resultado = "Cereza";
       else if (num==1)
           resultado = "Campana";

       return resultado;




    }

    public static String calcularPremio(
            String s1,
            String s2,
            String s3) {

        String resultado="TODOS DISTINTOS";
        if (s1.equals(s2)&&(s2.equals(s3)))
            resultado = "TODOS IGUALES";
        else if (s1.equals(s2)||s2.equals(s3)||s1.equals(s3))
            resultado = "DOS IGUALES";

        return resultado;
    }

    /* ======================================================
       1.2 CARRERA DE MASCOTAS
       ====================================================== */

    public static void ejecutarCarrera(Scanner scanner) {

        System.out.println("\n--- CARRERA DE MASCOTAS ---");

        // TODO:
        String mascota = pedirMascota(scanner);
        System.out.println(mascota);
        int posicionMascota = 0, posicionRival=0;
        while(posicionMascota<20&&posicionRival<20){
            posicionMascota+=generarAvance();
            posicionRival+=generarAvance();
        }

        System.out.println(calcularGanador(posicionMascota, posicionRival));
    }

    // MÉTODO YA IMPLEMENTADO (NO MODIFICAR)
    public static String pedirMascota(Scanner scanner) {

        String mascota = "";

        while (mascota.isEmpty()) {

            System.out.print("Elige tu mascota (Perro, Gato o Conejo): ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("Perro")) {
                mascota = "Perro";
            } else if (entrada.equalsIgnoreCase("Gato")) {
                mascota = "Gato";
            } else if (entrada.equalsIgnoreCase("Conejo")) {
                mascota = "Conejo";
            } else {
                System.out.println("Mascota no válida. Inténtalo de nuevo.");
            }
        }

        return mascota;
    }

    public static int generarAvance() {

        Random rd = new Random();
        return (rd.nextInt(1,7));
    }

    public static String calcularGanador(
            int jugador,
            int rival) {

        String resultado="Empate";
        if (jugador>rival)
            resultado = "Gana jugador";
        else if (rival>jugador)
            resultado = "Gana rival";

        return resultado;
    }
}