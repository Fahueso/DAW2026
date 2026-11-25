package UD03;

import java.util.Random;

public class JuegoDanyo {

    public static int generarDanio(Random random) {
        return random.nextInt(10) + 1;
    }

    public static int aplicarDanio(int vida, int danio) {
        return vida - danio;
    }

    public static boolean sigueVivo(int vida) {
        return vida > 0;
    }

    public static void main(String[] args) {

        // Crear el objeto Random


        // Vida inicial de los jugadores


        // Variable para controlar las rondas


        System.out.println("=== COMIENZA EL COMBATE ===");

        // Mientras ambos jugadores sigan vivos
        while (/* COMPLETAR */) {

            System.out.println("\nRONDA " + ronda);

            // TURNO DEL JUGADOR 1

            // Generar daño

            // Aplicar daño al jugador 2

            // Mostrar información del ataque


            // Si el jugador 2 sigue vivo, ataca
            if (/* COMPLETAR */) {

                // Generar daño

                // Aplicar daño al jugador 1

                // Mostrar información del ataque

            }

            // Pasar a la siguiente ronda

        }

        System.out.println("\n=== FIN DEL COMBATE ===");

        // Mostrar ganador

    }
}