public class Metodos {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        saludar();
        sumar(2,3);
        System.out.println("Fin del programa");
    }
    public static void saludar(){
        System.out.println("Hola clase");
        saludarv2();
    }
    public static void saludarv2(){
        System.out.println("Hola clase de Java");
    }
    public static void sumar(int sumando1, int sumando2){
        System.out.println(sumando1+sumando2);
    }
}
