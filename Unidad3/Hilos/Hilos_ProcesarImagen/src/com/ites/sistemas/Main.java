package com.ites.sistemas;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        long tiempoInicio, tiempoFinal;
        try {
            String imageUrl = "src/com/ites/sistemas/goku.jpg";
            // Secuencial
            SimpleImage simpleImage = new SimpleImage(imageUrl);
            tiempoInicio = System.nanoTime();
            simpleImage.negative();
            tiempoFinal = System.nanoTime();
            System.out.println("Secuencial = " + ((tiempoFinal - tiempoInicio) / 1000000.0) + " milisegundos");
            simpleImage.save("src/com/ites/sistemas/simpleOutput.jpg");
            // Concurrente
            ConcurrentImage concurrentImage = new ConcurrentImage(imageUrl);
            tiempoInicio = System.nanoTime();
            concurrentImage.negative();
            tiempoFinal = System.nanoTime();
            System.out.println("Concurrente = " + ((tiempoFinal - tiempoInicio) / 1000000.0) + " milisegundos");
            concurrentImage.save("src/com/ites/sistemas/concurrentOutput.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}