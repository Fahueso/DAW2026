import java.util.Random;
public class MediaArray
{
    public static void main(String[] args) {

        int[] c = new int[1000000]; //Definicio de array sin inicializaciÃ³n de valores
        Random rd=new Random();
        for (int i=0;i<c.length;i++){//recorrido array `c` estÃ¡ndar
            c[i]=rd.nextInt(0,1000000); //inicialiar el valor de cada posiciÃ³n (iesimo)
        }
        //media de Array
        long acu=0; //necesario si vamos a acumular mas de 1200M - tope del int
        for (int i=0;i<c.length;i++){
            acu=acu+c[i]; //acu+=c[i]
        }
        System.out.println("La media es " + ((double)acu/c.length));


    }
}
