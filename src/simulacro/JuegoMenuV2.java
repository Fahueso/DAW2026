package simulacro;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase JuegoMenu que contiene juegos y un menú interactivo.
 */
public class JuegoMenuV2 {



    // ========================= EJERCICIO 2.2 =========================

    /**
	* El procedimiento caraCruz permite al usuario competir contra la máquina en varias rondas de lanzamiento de moneda. Se lleva un marcador de aciertos y fallos.  
	* - El jugador elige “cara” o “cruz”. 
	*- La máquina lanza la moneda (aleatorio). 
	*- Se compara el resultado con la elección del jugador. 
	*- Se repite durante 5 rondas. 
	* - Al final, se muestra el marcador: número de aciertos y fallos. 
	*- Se declara ganador al que tenga más aciertos (jugador vs máquina).      
	* Este procedimiento se debe construir empleando las siguientes funciones, en las que deberemos definir su prototipo: 
	*- lanzarMoneda(): devuelve aleatoriamente “cara” o “cruz”. (0.5 puntos) 
	*- pedirEleccionJugador(): pide al usuario su elección (“cara” o “cruz”). (0.5 punto) 
	*- evaluarRonda(String eleccionJugador, String resultadoMoneda): devuelve “acierto” cuando las dos elecciones coinciden o “fallo” en caso contrario. (0.5 punto) 
	*-  mostrarMarcador(int aciertos, int fallos): imprime el resultado final. (0.5 puntos) 
     */
    public static void caraCruz(Scanner sc) {
        
    }

  

    // ========================= EJERCICIO 2.3 =========================

    /**
     * Completa el procedimiento para crear un juego de adivinar una palabra letra a letra. Para ello el ordenador dispone de una palabra almacenada en un array de chars, y otro array de chars relleno de subguiones. 
     * Este procedimiento se debe construir empleando las siguientes funciones, en las que deberemos definir su prototipo: 
     * mostrarProgreso(char[] progreso): imprime el estado actual de la palabra con guiones bajos y letras acertadas. (0.5 puntos) 
     * edirLetraJugador(char[] usadas, int contadorUsadas): pide al usuario una letra por teclado hasta que introduzca una que no está en el array de usadas. (1 punto) 
     * actualizarProgreso(char[] palabra, char[] progreso, char letra): Revisa la letra, comparándola con la palabra, actualiza el progreso, sin devolver nada. (1 punto) 
     * comprobarFinPartida(char[] palabra, char[]  progreso): Revisa que la palabra del ordenador coincida con el progreso. Devuelve true si ya hemos acertado la palabra, y false en caso contrario (0.5 puntos). 
     */
    public static void palabraSecreta(Scanner sc) {
        char[] palabra = {'j', 'a', 'v', 'a'};
        char[] progreso = {'_', '_', '_', '_'};
        char[] usadas = new char[26];
	
	//completar
        
    }

    

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int opcion;
        do {

	System.out.println("=== MENÚ DE JUEGOS ===");
        System.out.println("1. Cara o Cruz");
        System.out.println("2. Palabra Secreta");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1: caraCruz(sc);
                        break;
                case 2: palabraSecreta(sc);
                        break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 3);
    }
}
