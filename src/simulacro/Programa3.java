package simulacro;

import java.util.Scanner;

/*
 * PROGRAMA 3: MENÚ DE ANÁLISIS DE UNA FRASE
 * ---------------------------------------------------------------
 * Escribe un programa que pida una frase al usuario una sola vez y
 * luego muestre de forma repetida el siguiente menú hasta que el
 * usuario elija la opción 5:
 *
 *      1. Mostrar la frase limpia y en mayúsculas
 *      2. Contar las vocales
 *      3. Comprobar si contiene la palabra "JAVA"
 *      4. Mostrar la frase al revés
 *      5. Salir
 *
 * Apartados:
 *  a) Lee la frase y prepárala: elimina los espacios del principio y
 *     del final, y pásala a mayúsculas. Todas las opciones del menú
 *     trabajan con esta frase ya preparada.
 *  b) Muestra el menú de forma repetida. La opción se lee como un
 *     número entero. Si la opción no es del 1 al 5, muestra
 *     "Opción no válida" y vuelve a mostrar el menú.
 *  c) Implementa las opciones:
 *       1. Muestra la frase preparada.
 *       2. Cuenta las vocales y muestra "Vocales: X", donde X es el
 *          número de vocales. Solo cuentan las letras A, E, I, O, U
 *          (las vocales con tilde no cuentan).
 *       3. Muestra "Contiene JAVA" o "No contiene JAVA".
 *       4. Muestra la frase preparada con los caracteres en orden
 *          inverso.
 *       5. Muestra "Hasta pronto" y termina el programa.
 *
 * EJEMPLO DE USO (el texto con el que se pide la frase y la opción
 * es libre; "[menú]" indica que se vuelve a mostrar el menú completo):
 *
 *      Introduce una frase:   Aprendo Java hoy
 *      [menú]
 *      Elige una opción: 1
 *      APRENDO JAVA HOY
 *      [menú]
 *      Elige una opción: 2
 *      Vocales: 6
 *      [menú]
 *      Elige una opción: 3
 *      Contiene JAVA
 *      [menú]
 *      Elige una opción: 4
 *      YOH AVAJ ODNERPA
 *      [menú]
 *      Elige una opción: 7
 *      Opción no válida
 *      [menú]
 *      Elige una opción: 5
 *      Hasta pronto
 *
 * Recuerda comentar tu código.
 */
public class Programa3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        int opcion = 0;
        //a
        frase = frase.trim().toUpperCase();
        do{
            System.out.println("""
                     1. Mostrar la frase limpia y en mayúsculas
                     2. Contar las vocales
                     3. Comprobar si contiene la palabra "JAVA"
                     4. Mostrar la frase al revés
                     5. Salir
                    """);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(frase);
                    break;
                    case 2:
                        int cuenta = 0;
                        for (int i=0;i<frase.length();i++){
                            char c = frase.charAt(i);
                            if ((c=='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
                                cuenta++;
                            }
                        }
                        System.out.println("Hay " + cuenta + " vocales");



                        break;
                    case 3:
                            if (frase.contains("JAVA")){
                                System.out.println("Contiene JAVA");
                            } else {
                                System.out.println("No contiene JAVA");
                            }

                        break;
                    case 4:
                            String invertida = "";
                            for (int i=frase.length()-1;i>=0;i--){
                                invertida = invertida + frase.charAt(i);
                            }
                        System.out.println(invertida);
                        break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=5);




        teclado.close();
    }
}
