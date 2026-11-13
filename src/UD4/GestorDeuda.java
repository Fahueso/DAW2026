package UD4;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorDeuda {
    static void main() {
        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Double> deudas = new ArrayList<>();

        clientes.add("Alfonso");
        deudas.add(1.0);


        String nuevoCliente = "Teresa";
        double deudaNuevoCliente = 2.0;

        if (!clientes.contains(nuevoCliente)) {
            clientes.add(nuevoCliente);
            deudas.add(deudaNuevoCliente);
        } else {
            System.out.println("Cliente repetido");
        }


        System.out.println(clientes);
        System.out.println(deudas);

        if (clientes.contains("Teresa")) {
            int posicion = clientes.indexOf("Teresa");
            clientes.remove(posicion);
            deudas.remove(posicion);
        }
//        Iterator<String> it = clientes.iterator();
//        int indice = -1;
//        while (it.hasNext()){
//            indice++;
//            String cliente = it.next();
//            if (cliente.startsWith("T")){ //o equals
//                it.remove();
//                deudas.remove(indice);
//            }
//        }
        System.out.println(clientes);
        System.out.println(deudas);

        for(String cliente:clientes){
            System.out.println(cliente);
        }
        for(Double deuda:deudas){
            System.out.println(deuda);
        }
        for (int i=0;i<clientes.size();i++){
            System.out.println(clientes.get(i) + " - " + deudas.get(i));
        }


        if (clientes.contains("Teresa")) {
            int posicion = clientes.indexOf("Teresa");
            System.out.println(deudas.get(posicion));
        }

        if (clientes.contains("Teresa")) {
            int posicion = clientes.indexOf("Teresa");
            Double nuevaDeuda=10.0;
            deudas.set(posicion, nuevaDeuda);
        }



    }


}


