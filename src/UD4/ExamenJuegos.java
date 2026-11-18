package UD4;

import java.util.Random;
import java.util.Scanner;

/**
 * EXAMEN PARTE 1: MODULARIZACIÓN Y LÓGICA DE JUEGOS
 *
 * OBJETIVO:
 * Completar los métodos marcados con TODO para que el programa funcione como
 * se describe a continuación. NO se pueden modificar las firmas de los métodos
 * (nombre, parámetros y tipo de retorno) NI el método main.
 * Se evaluará la fragmentación de la lógica en métodos: los métodos
 * "ejecutar..." solo COORDINAN (llaman a los demás métodos y muestran
 * mensajes); no deben contener la lógica de generar, pedir o evaluar.
 *
 * EJEMPLO DE UTILIZACIÓN DE MÉTODOS:
 * Si debes pedir un dato, no uses 'scanner.nextInt()' directamente en el juego,
 * sino crea un método:
 * public static int pedirDato(Scanner sc) {
 *     System.out.println("Introduce valor:");
 *     return sc.nextInt();
 * }
 *
 * ============================================================================
 * 1.1 RETO DEL NÚMERO SECRETO (3 pts)
 * ============================================================================
 * Reglas:
 *  - generarNumero(): devuelve un entero aleatorio entre 1 y 100, ambos
 *    incluidos. (0.5 pts)
 *  - pedirIntento(Scanner): muestra "Tu número: " (sin salto de línea) y
 *    devuelve el entero introducido por el jugador. (0.5 pts)
 *  - evaluarIntento(int intento, int secreto): devuelve EXACTAMENTE uno de
 *    estos tres textos (1 pt):
 *        "Demasiado alto"  -> si intento > secreto
 *        "Demasiado bajo"  -> si intento < secreto
 *        "Correcto"        -> si intento == secreto
 *  - ejecutarAdivinarNumero(Scanner): (1 pt de lógica general)
 *        1. Genera el número secreto UNA sola vez al empezar la partida.
 *        2. Repite: pide un intento, cuenta el intento, lo evalúa y muestra
 *           el resultado de evaluarIntento.
 *        3. Termina cuando el resultado es "Correcto" y muestra:
 *           "¡Lo has conseguido en N intentos!"  (N = intentos realizados;
 *           si N es 1, el texto debe ser "¡Lo has conseguido en 1 intento!")
 *
 * Ejemplo de ejecución (secreto = 42; lo que escribe el jugador va tras ">"):
 *
 *   === MENÚ DE JUEGOS ===
 *   1. Reto del Número Secreto
 *   2. Duelo de Piedra, Papel o Tijera
 *   3. Salir
 *   Seleccione una opción: > 1
 *
 *   --- Bienvenido al Reto del Número Secreto ---
 *   Tu número: > 50
 *   Demasiado alto
 *   Tu número: > 20
 *   Demasiado bajo
 *   Tu número: > 42
 *   Correcto
 *   ¡Lo has conseguido en 3 intentos!
 *
 * ============================================================================
 * 1.2 DUELO DE PIEDRA, PAPEL O TIJERA (4 pts)
 * ============================================================================
 * Se juega UNA sola ronda cada vez que se elige esta opción.
 * Reglas:
 *  - generarTiradaMaquina(): devuelve al azar uno de estos tres textos,
 *    exactamente así escritos: "Piedra", "Papel" o "Tijera". (0.5 pts)
 *  - pedirTiradaJugador(Scanner): (1.25 pts)
 *        * Muestra "Elige Piedra, Papel o Tijera: " (sin salto de línea).
 *        * Lee una palabra. Se acepta en cualquier combinación de
 *          mayúsculas/minúsculas ("piedra", "PAPEL", "TiJeRa").
 *        * Si la palabra NO es válida, muestra
 *          "Opción no válida. Inténtalo de nuevo." y vuelve a pedirla,
 *          tantas veces como haga falta.
 *        * Devuelve la tirada normalizada: "Piedra", "Papel" o "Tijera"
 *          (primera letra en mayúscula y el resto en minúscula).
 *  - calcularGanador(String jugador, String maquina): recibe tiradas ya
 *    normalizadas y devuelve EXACTAMENTE uno de estos textos (1.25 pts):
 *        "Empate"   -> si ambas tiradas son iguales
 *        "Jugador"  -> si gana el jugador
 *        "Máquina"  -> si gana la máquina
 *    Piedra gana a Tijera, Tijera gana a Papel, Papel gana a Piedra.
 *  - ejecutarPiedraPapelTijera(Scanner): (1 pt de lógica general)
 *        1. Pide la tirada del jugador y genera la de la máquina.
 *        2. Muestra: "Tú: <tirada> | Máquina: <tirada>"
 *        3. Calcula el ganador y muestra según el resultado:
 *             "Jugador" -> "¡Ganas tú!"
 *             "Máquina" -> "Gana la máquina."
 *             "Empate"  -> "Empate."
 *
 * Ejemplo de ejecución 1 (el jugador escribe en minúsculas, gana el jugador):
 *
 *   --- Bienvenido al Duelo de Piedra, Papel o Tijera ---
 *   Elige Piedra, Papel o Tijera: > papel
 *   Tú: Papel | Máquina: Piedra
 *   ¡Ganas tú!
 *
 * Ejemplo de ejecución 2 (entrada no válida y después derrota):
 *
 *   --- Bienvenido al Duelo de Piedra, Papel o Tijera ---
 *   Elige Piedra, Papel o Tijera: > lagarto
 *   Opción no válida. Inténtalo de nuevo.
 *   Elige Piedra, Papel o Tijera: > PIEDRA
 *   Tú: Piedra | Máquina: Papel
 *   Gana la máquina.
 *
 * Ejemplo de ejecución 3 (empate):
 *
 *   --- Bienvenido al Duelo de Piedra, Papel o Tijera ---
 *   Elige Piedra, Papel o Tijera: > Tijera
 *   Tú: Tijera | Máquina: Tijera
 *   Empate.
 *
 * ============================================================================
 * MENÚ (0.5 pts) - YA IMPLEMENTADO EN main
 * ============================================================================
 *  - Opción 1 -> ejecutarAdivinarNumero, opción 2 -> ejecutarPiedraPapelTijera,
 *    opción 3 -> "Saliendo del juego...", otro número -> "Opción no válida."
 *    Tras terminar un juego se vuelve a mostrar el menú. (Puntúa que tus
 *    métodos respeten este flujo y no cierren el programa por su cuenta.)
 *
 * PISTAS:
 *  - Para comparar textos usa equals() / equalsIgnoreCase(), nunca ==.
 *  - Para normalizar: palabra.substring(0, 1).toUpperCase()
 *                     + palabra.substring(1).toLowerCase()
 *  - No crees un nuevo Scanner: usa siempre el que recibes por parámetro.
 *
 * VALORACIÓN:
 * - Menú: 0.5 pts
 * - Adivinar Número: 3 pts (Generar: 0.5, Pedir: 0.5, Evaluar: 1, Lógica General: 1)
 * - Piedra, Papel o Tijera: 4 pts (Máquina: 0.5, Jugador: 1.25, Ganador: 1.25, Lógica: 1)
 */
public class ExamenJuegos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE JUEGOS ===");
            System.out.println("1. Reto del Número Secreto");
            System.out.println("2. Duelo de Piedra, Papel o Tijera");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarAdivinarNumero(scanner);
                    break;
                case 2:
                    ejecutarPiedraPapelTijera(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        scanner.close();
    }

    /* --- 1.1 RETO DEL NÚMERO SECRETO --- */
    public static void ejecutarAdivinarNumero(Scanner scanner) {
        System.out.println("\n--- Bienvenido al Reto del Número Secreto ---");
        // TODO: Coordinar: generarNumero(), pedirIntento() en bucle y evaluarIntento().

        int secreto = generarNumero();
        int intentos = 0;
        int intento;
        String resultado;
        boolean correcto = false;

        do {
            intento = pedirIntento(scanner);
            intentos++;

            resultado = evaluarIntento(intento, secreto);

            System.out.println(resultado);

            if (resultado.equals("Correcto")) {
                correcto = true;
            }

        } while (!correcto);

        if (intentos == 1) {
            System.out.println("¡Lo has conseguido en 1 intento!");
        } else {
            System.out.println("¡Lo has conseguido en " + intentos + " intentos!");
        }
    }

    public static int generarNumero() {
        // TODO: devolver un entero aleatorio entre 1 y 100 (ambos incluidos).

        Random r = new Random();

        return r.nextInt(100) + 1;
    }

    public static int pedirIntento(Scanner scanner) {
        // TODO: mostrar "Tu número: " y devolver el entero leído.
        System.out.print("Tu número: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static String evaluarIntento(int intento, int secreto) {
        // TODO: devolver "Demasiado alto", "Demasiado bajo" o "Correcto".
        String resultado;

        if (intento > secreto) {
            resultado = "Demasiado alto";
        } else if (intento < secreto) {
            resultado = "Demasiado bajo";
        } else {
            resultado = "Correcto";
        }

        return resultado;
    }

    /* --- 1.2 PIEDRA, PAPEL O TIJERAS --- */
    public static void ejecutarPiedraPapelTijera(Scanner scanner) {
        System.out.println("\n--- Bienvenido al Duelo de Piedra, Papel o Tijera ---");
        // TODO: Coordinar: pedirTiradaJugador(), generarTiradaMaquina() y calcularGanador().
        String jugador = pedirTiradaJugador(scanner);

        String maquina = generarTiradaMaquina();

        System.out.println("Tú: " + jugador + " | Máquina: " + maquina);

        String ganador = calcularGanador(jugador, maquina);

        if (ganador.equals("Jugador")) {
            System.out.println("¡Ganas tú!");
        } else if (ganador.equals("Máquina")) {
            System.out.println("Gana la máquina.");
        } else {
            System.out.println("Empate.");
        }
    }

    public static String generarTiradaMaquina() {
        // TODO: devolver "Piedra", "Papel" o "Tijera" al azar.
        String[] opciones = {"Piedra", "Papel", "Tijera"};

        Random random = new Random();

        return opciones[random.nextInt(3)];

    }

    public static String pedirTiradaJugador(Scanner scanner) {
        // TODO: pedir la tirada, validarla (repetir si no es válida) y
        String tirada;
        String resultado = "";

        do {
            System.out.print("Elige Piedra, Papel o Tijera: ");
            tirada = scanner.next();

            if (tirada.equalsIgnoreCase("piedra")) {
                resultado = "Piedra";
            } else if (tirada.equalsIgnoreCase("papel")) {
                resultado = "Papel";
            } else if (tirada.equalsIgnoreCase("tijera")) {
                resultado = "Tijera";
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (resultado.equals(""));

        return resultado;
    }

    public static String calcularGanador(String jugador, String maquina) {
        // TODO: devolver "Empate", "Jugador" o "Máquina".
        String ganador;

        if (jugador.equals(maquina)) {
            ganador = "Empate";
        } else if (jugador.equals("Piedra") && maquina.equals("Tijera")) {
            ganador = "Jugador";
        } else if (jugador.equals("Tijera") && maquina.equals("Papel")) {
            ganador = "Jugador";
        } else if (jugador.equals("Papel") && maquina.equals("Piedra")) {
            ganador = "Jugador";
        } else {
            ganador = "Máquina";
        }

        return ganador;
    }
}