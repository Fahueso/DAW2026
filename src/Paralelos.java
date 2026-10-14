public class Paralelos {
    public static void main(String[] args) {
        String[] nombres = {"Luis","Ana","Luz", "Daniela"};
        int[] edades = {20,19,21,15};
        String[] poblacion = {"Sagunto", "Puerto", "Puzol", "Vall"};
        String[] sexo = {"M", "F", "F","F"};
        //listar como si fuera un select *
        for (int i=0;i<edades.length;i++){
            System.out.println(nombres[i] + " tiene "
                    + edades[i] + " años y vive en "
                    + poblacion[i]);
        }
        //listar nombres  si  edad >=18
        for (int i=0;i<edades.length;i++){
            if (edades[i]>=18) {
                System.out.println(nombres[i] + " es mayor de edad");
            }
            if (sexo[i].equals("M")){
                System.out.println(nombres[i] + " es chico");
            }
        }

    }
}
