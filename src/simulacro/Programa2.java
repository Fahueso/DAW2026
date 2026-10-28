package simulacro;

import java.util.Scanner;

/*
 * PROGRAMA 2: PRODUCTOS Y PRECIOS
 * ---------------------------------------------------------------
 * Una tienda guarda sus productos en dos arrays paralelos: en la
 * posición i de "productos" está el nombre y en la posición i de
 * "precios" está su precio en euros (número entero).
 *
 * Apartados:
 *  a) Muestra cada producto con su precio, uno por línea.
 *     Formato: "Pan: 2 €".
 *  b) Calcula y muestra el precio total de todos los productos
 *     y el precio medio. La media puede tener decimales y debe
 *     mostrarse redondeada a dos decimales (usa el método estático
 *     Math.round).
 *  c) Muestra el nombre y el precio del producto más caro
 *     y cuántos productos cuestan menos de 4 euros (4 no cuenta).
 *  d) Pide al usuario el nombre de un producto y muestra su precio
 *     con el formato "Pan: 2 €". Si el producto no existe,
 *     muestra "Producto no encontrado".
 *     Repite la búsqueda hasta que el usuario escriba "fin".
 *     Los nombres (y la palabra "fin") se aceptan escritos con
 *     cualquier combinación de mayúsculas y minúsculas: "pan",
 *     "PAN" y "Pan" encuentran el mismo producto. No hay que tener
 *     en cuenta las tildes: el usuario escribe "Café" tal como está
 *     en el array.
 *
 * EJEMPLO DE USO (el formato de las líneas de los apartados a) y d)
 * debe ser el del ejemplo; en el resto, el texto es libre mientras
 * se vean los valores indicados):
 *
 *      Pan: 2 €
 *      Leche: 1 €
 *      Huevos: 3 €
 *      Aceite: 9 €
 *      Café: 4 €
 *      Queso: 6 €
 *      Precio total: 25
 *      Precio medio: 4.17
 *      Producto más caro: Aceite (9 €)
 *      Productos de menos de 4 €: 3
 *      Producto a buscar: queso
 *      Queso: 6 €
 *      Producto a buscar: PLATANO
 *      Producto no encontrado
 *      Producto a buscar: FIN
 *
 * Recuerda comentar tu código.
 */


import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] productos = {
                "Pan", "Leche", "Huevos", "Aceite", "Café", "Queso"
        };

        int[] precios = {2, 1, 3, 9, 4, 6};

        // Apartado a) Mostrar cada producto con su precio
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + precios[i] + " €");
        }

        // Apartado b) Calcular el precio total y el precio medio
        int total = 0;

        for (int i = 0; i < precios.length; i++) {
            total += precios[i];
        }

        double media = (double) total / precios.length;

        // Redondear la media a dos decimales usando Math.round No visto en clase!!
        media = Math.round(media * 100.0) / 100.0;

        System.out.println("Precio total: " + total);
        System.out.printf("Precio medio: %.2f%n", media);  //no visto en clase!!!

        // Apartado c) Producto más caro y productos de menos de 4 €
        int indiceCaro = 0;
        int baratos = 0;

        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > precios[indiceCaro]) {
                indiceCaro = i;
            }

            if (precios[i] < 4) {
                baratos++;
            }
        }

        System.out.println("Producto más caro: "
                + productos[indiceCaro] + " ("
                + precios[indiceCaro] + " €)");

        System.out.println("Productos de menos de 4 €: " + baratos);

        // Apartado d) Buscar productos hasta escribir "fin"
        String nombre;

        do {
            System.out.print("Producto a buscar: ");
            nombre = teclado.nextLine().trim();

            if (!nombre.equalsIgnoreCase("fin")) {
                boolean encontrado = false;

                for (int i = 0; i < productos.length; i++) {
                    if (productos[i].equalsIgnoreCase(nombre)) {
                        System.out.println(productos[i] + ": "
                                + precios[i] + " €");
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado");
                }
            }

        } while (!nombre.equalsIgnoreCase("fin"));

        teclado.close();
    }
}


