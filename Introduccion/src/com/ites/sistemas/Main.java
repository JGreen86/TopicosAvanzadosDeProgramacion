package com.ites.sistemas;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // variables
    int a = 5;
    double b = 5.0;
    boolean c = true;
    char d = 'a';
    Integer x = 5;
    Double y = 5.0;
    Boolean w = false;
    Character z = 'a';
    String cadena = "Hola mundo!!!";

    public static void main(String[] args) {
        System.out.println("Hola mundo!!!");
        // arreglos
        int[] A = new int[3];
        A[0] = 3;
        A[1] = 7;
        A[2] = 4;
        int[] B = {3,7,4,2,9};
        // ciclo for
        for(int i=0; i<A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("======================");
        for (int item: B) {
            System.out.println(item);
        }
        System.out.println("======================");
        // ciclo while
        int i = 0;
        while (i < A.length) {
            System.out.println(A[i]);
            i++;
        }
        System.out.println("======================");
        // do-while
        i = 0;
        do {
            System.out.println(A[i]);
            i++;
        } while (i < A.length);
        System.out.println("======================");
        // if
        boolean b = true;
        if(b) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        System.out.println("======================");
        // switch
        int opcion = 1;
        switch (opcion) {
            case 0:
                System.out.println("Opcion 0");
                break;
            case 1:
                System.out.println("Opcion 1");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        System.out.println("======================");
        // listas
        ArrayList<Integer> lista = new ArrayList<>(); // lista basada en arreglo
        lista.add(3); // insercion al final
        lista.add(5);
        lista.add(1);
        lista.add(1, 4); // insertar 4 en posicion 1
        lista.remove(0);
        lista.set(2, 8); // actualizar el valor de la posicion 2 por un 8
        for (int item : lista) {
            System.out.println(item);
        }
        System.out.println("======================");
        LinkedList<Integer> lista2 = new LinkedList<>(); // lista enlazada
        lista2.add(3); // insercion al final
        lista2.add(5);
        lista2.add(1);
        lista2.add(1, 4); // insertar 4 en posicion 1
        lista2.remove(0);
        lista2.set(2, 8); // actualizar el valor de la posicion 2 por un 8
        for (int item : lista2) {
            System.out.println(item);
        }


    }
}
