import java.util.Locale;

public class Cadenas2 {
    static void main() {
        String cadena = "Luis,Maria,Antonio";
        System.out.println(cadena.replace('o','a'));//Antania!!
        System.out.println(cadena.replace("Luis","Javier"));//Javier,Maria,Antonio
        String[] subcadenas = cadena.split(",");
        for (int i=0;i<subcadenas.length;i++){
            System.out.println(subcadenas[i]);
        }
        cadena = cadena.toLowerCase(); //reapuntamos la variable a una nueva String
        //las Strings en realidad son inmutables


    }
}
