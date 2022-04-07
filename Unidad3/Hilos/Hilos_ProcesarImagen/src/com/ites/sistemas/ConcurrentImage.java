package com.ites.sistemas;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConcurrentImage {

    private String imageUrl;
    private BufferedImage img;

    public ConcurrentImage(String imageUrl) throws IOException {
        this.imageUrl = imageUrl;
        File file = new File(imageUrl);
        img = ImageIO.read(file);
    }

    public void negative() {
        int numProcesadores = Runtime.getRuntime().availableProcessors();
        int height = img.getHeight(); // numero de filas
        int increment = height / numProcesadores;
        NegativeFilter[] hilos = new NegativeFilter[numProcesadores];
        int inicio;
        int fin;
        for(int i=0; i<numProcesadores; i++) {
            inicio = (increment * i);
            if(i == (numProcesadores - 1)) {
                fin = height;
            } else {
                fin = inicio + increment;
            }
            hilos[i] = new NegativeFilter(i, img, inicio, fin);
            hilos[i].start();
        }

        for(int i=0; i<numProcesadores; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void save(String outputUrl) throws IOException {
        File outputFile = new File(outputUrl);
        ImageIO.write(img, "JPG", outputFile);
    }
}