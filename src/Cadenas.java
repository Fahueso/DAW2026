public class Cadenas {
    static void main() {
        String cadena="Hola"; //O BIEN String cadena = new String("hola");
        System.out.println(cadena);
        System.out.println(cadena.length()); //4
        System.out.println(cadena.charAt(0)); //H
        //System.out.println(cadena.charAt(10)); //error StringIndexOutOfBoundsException
        System.out.println(cadena.charAt(cadena.length()-1));//a -> la última
        System.out.println(cadena.toUpperCase()); //HOLA
        System.out.println(cadena.toLowerCase()); //hola
        System.out.println(cadena.substring(1,3)); //ol
        System.out.println(cadena.substring(1, cadena.length())); //ola
        System.out.println(cadena.substring(1)); //ola







    }
}
