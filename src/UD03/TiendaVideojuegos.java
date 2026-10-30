package UD03;

import java.util.Scanner;

public class TiendaVideojuegos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String titulo = "";
        String plataforma = "";
        String genero = "";
        double precio = 0;
        int stock = 0;

        boolean registrado = false;

        int opcion;

        do {

            imprimirMenu();


            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println();
                System.out.println("REGISTRO DE VIDEOJUEGO");

                titulo = pedirCadena(sc, "Título: ");
                plataforma = pedirCadena(sc, "Plataforma: ");
                genero = pedirCadena(sc,"Género:  ");
                precio = pedirDoublePositivo(sc, "Precio: ", "Error. El precio no puede ser negativo.");
                stock = pedirIntPositivo(sc,"Stock inicial: ", "Error. El stock no puede ser negativo." );

                registrado = true;

                System.out.println();
                System.out.println("Videojuego registrado correctamente.");

            } else if (opcion == 2) {
               //TODO impimirJuego(registrado, titulo, plataforma, precio);

                System.out.println();

                if (registrado) {

                    System.out.println("DATOS DEL VIDEOJUEGO");
                    System.out.println("Título: " + titulo);
                    System.out.println("Plataforma: " + plataforma);
                    System.out.println("Precio: " + precio + " €");

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 3) {

                System.out.println();

                if (registrado) {

                    double nuevoPrecio;

                    do {

                        System.out.print("Nuevo precio: ");
                        nuevoPrecio = sc.nextDouble();

                        if (nuevoPrecio < 0) {
                            System.out.println("Error. Precio incorrecto.");
                        }

                    } while (nuevoPrecio < 0);

                    precio = nuevoPrecio;

                    System.out.println("Precio actualizado.");

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 4) {

                System.out.println();

                if (registrado) {

                    double descuento;

                    do {

                        System.out.print("Introduzca descuento (%): ");
                        descuento = sc.nextDouble();

                        if (descuento < 0 || descuento > 100) {
                            System.out.println("Descuento inválido.");
                        }

                    } while (descuento < 0 || descuento > 100);

                    precio = precio - (precio * descuento / 100);

                    System.out.println("Precio final: " + precio + " €");

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 5) {

                System.out.println();

                if (registrado) {

                    if (stock > 0) {

                        stock--;

                        System.out.println("Venta realizada.");
                        System.out.println("Stock restante: " + stock);

                    } else {

                        System.out.println("No quedan unidades disponibles.");
                    }

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 6) {

                System.out.println();

                if (registrado) {

                    int unidades;

                    do {

                        System.out.print("¿Cuántas unidades desea añadir?: ");
                        unidades = sc.nextInt();

                        if (unidades < 0) {
                            System.out.println("Cantidad incorrecta.");
                        }

                    } while (unidades < 0);

                    stock += unidades;

                    System.out.println("Nuevo stock: " + stock);

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 7) {

                System.out.println();

                if (registrado) {

                    if (stock > 0) {
                        System.out.println("Disponible.");
                    } else {
                        System.out.println("Sin existencias.");
                    }

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 8) {

                System.out.println();

                if (registrado) {

                    if (precio < 20) {

                        System.out.println("Valoración económica.");

                    } else if (precio < 50) {

                        System.out.println("Valoración media.");

                    } else {

                        System.out.println("Valoración premium.");
                    }

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 9) {

                System.out.println();

                if (registrado) {

                    System.out.println("FICHA COMPLETA");
                    System.out.println("---------------------------");
                    System.out.println("Título: " + titulo);
                    System.out.println("Plataforma: " + plataforma);
                    System.out.println("Género: " + genero);
                    System.out.println("Precio: " + precio + " €");
                    System.out.println("Stock: " + stock);

                    if (stock > 0) {
                        System.out.println("Disponible: Sí");
                    } else {
                        System.out.println("Disponible: No");
                    }

                    if (precio < 20) {
                        System.out.println("Categoría: Económica");
                    } else if (precio < 50) {
                        System.out.println("Categoría: Media");
                    } else {
                        System.out.println("Categoría: Premium");
                    }

                } else {

                    System.out.println("No hay videojuego registrado.");
                }

            } else if (opcion == 10) {

                System.out.println();
                System.out.println("Gracias por utilizar el sistema.");

            } else {

                System.out.println();
                System.out.println("Opción incorrecta.");

            }

        } while (opcion != 10);

        sc.close();
    }


    private static double pedirDoublePositivo(Scanner sc, String s, String s1) {
        double num;
        do {
            System.out.print(s);
            num = sc.nextDouble();

            if (num < 0) {
                System.out.println(s1);
            }

        } while (num < 0);
        return num;
    }

    private static int pedirIntPositivo(Scanner sc, String s, String s1) {
        int num;
        do {
            System.out.print(s);
            num = sc.nextInt();

            if (num < 0) {
                System.out.println(s1);
            }

        } while (num < 0);
        return num;
    }

    private static String pedirCadena(Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextLine();
//        String plataforma;
//        System.out.println(msg);
//        plataforma = sc.nextLine();
//        return plataforma;
    }

    public static void imprimirMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("     TIENDA DE VIDEOJUEGOS");
        System.out.println("=================================");
        System.out.println("1. Registrar videojuego");
        System.out.println("2. Mostrar videojuego");
        System.out.println("3. Cambiar precio");
        System.out.println("4. Aplicar descuento");
        System.out.println("5. Vender unidad");
        System.out.println("6. Reponer stock");
        System.out.println("7. Consultar disponibilidad");
        System.out.println("8. Mostrar valoración");
        System.out.println("9. Mostrar ficha completa");
        System.out.println("10. Salir");
        System.out.print("Seleccione una opción: ");

    }
}