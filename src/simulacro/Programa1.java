package simulacro;

import java.util.Random;
import java.util.Scanner;

/*
 * PROGRAMA 1: ADIVINA EL NÚMERO
 * ---------------------------------------------------------------
 * El ordenador "piensa" un número aleatorio entre 1 y 20 y el
 * usuario tiene que adivinarlo. Dispone de un máximo de 5 intentos.
 * El juego termina cuando el usuario acierta o cuando agota los 5 intentos.
 *
 * Apartados:
 *  a) Genera el número secreto con Random (entre 1 y 20, ambos incluidos).
 *  b) En cada intento pide un número al usuario:
 *       - Si no está entre 1 y 20 (ambos incluidos), muestra
 *         "Número fuera de rango" y vuelve a pedirlo. Ese intento
 *         NO cuenta como intento gastado.
 *       - Si está dentro del rango, cuenta como un intento y muestra
 *         una de estas tres respuestas:
 *           "El número secreto es MAYOR"  (si el número introducido es menor que el secreto)
 *           "El número secreto es MENOR"  (si el número introducido es mayor que el secreto)
 *           "¡Has acertado!"              (si es igual; el juego termina)
 *  c) Al terminar el juego, muestra:
 *       - Si ha acertado: "Lo has conseguido en X intentos", donde X
 *         es el número de intentos gastados.
 *       - Si no ha acertado: "Has perdido. El número era X", donde X
 *         es el número secreto.
 *
 * EJEMPLO DE USO (el número secreto es 14; el texto con el que se
 * pide el número es libre):
 *
 *      Introduce un número: 25
 *      Número fuera de rango
 *      Introduce un número: 10
 *      El número secreto es MAYOR
 *      Introduce un número: 18
 *      El número secreto es MENOR
 *      Introduce un número: 14
 *      ¡Has acertado!
 *      Lo has conseguido en 3 intentos
 *
 * EJEMPLO DE USO CUANDO SE AGOTAN LOS INTENTOS (el número secreto es 7):
 *
 *      Introduce un número: 1
 *      El número secreto es MAYOR
 *      Introduce un número: 2
 *      El número secreto es MAYOR
 *      Introduce un número: 3
 *      El número secreto es MAYOR
 *      Introduce un número: 4
 *      El número secreto es MAYOR
 *      Introduce un número: 5
 *      El número secreto es MAYOR
 *      Has perdido. El número era 7
 *
 * Recuerda comentar tu código.
 */
public class Programa1 {
    public static void main(String[] args) {
// Creamos los objetos para generar números aleatorios y leer datos
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        // Generamos el número secreto entre 1 y 20, ambos incluidos
        int secreto = random.nextInt(0,21);

        // Inicializamos las variables
        int numero;
        int intentos = 0;
        boolean acertado = false;

        // Repetimos mientras queden intentos y no se haya acertado
        do {
            // Pedimos un número al usuario
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            // Comprobamos si el número está fuera del rango
            if (numero < 1 || numero > 20) {
                System.out.println("Número fuera de rango");
            } else {
                // El intento solo cuenta si está dentro del rango
                intentos++;

                // Comparamos el número introducido con el secreto
                if (numero < secreto) {
                    System.out.println("El número secreto es MAYOR");
                } else if (numero > secreto) {
                    System.out.println("El número secreto es MENOR");
                } else {
                    System.out.println("¡Has acertado!");
                    acertado = true;
                }
            }

        } while (intentos < 5 && !acertado);

        // Mostramos el resultado final
        if (acertado) {
            System.out.println("Lo has conseguido en " + intentos + " intentos");
        } else {
            System.out.println("Has perdido. El número era " + secreto);
        }

        // Cerramos el Scanner
        teclado.close();
    }
}
