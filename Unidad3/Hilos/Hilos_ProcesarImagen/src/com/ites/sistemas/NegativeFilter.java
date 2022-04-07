package com.ites.sistemas;

import java.awt.*;
import java.awt.image.BufferedImage;

public class NegativeFilter extends Thread {
    private int id;
    private BufferedImage img;
    private int inicio;
    private int fin;

    public NegativeFilter(int id, BufferedImage bufferedImage, int inicio, int fin) {
        this.id = id;
        this.img = bufferedImage;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        super.run();
        int pixel, red, green, blue;
        for (int y = inicio; y < fin; y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                //Retrieving contents of a pixel
                pixel = img.getRGB(x, y);
                //Creating a Color object from pixel value
                Color color = new Color(pixel, true);
                //Retrieving the R G B values
                red = 255 - color.getRed();
                green = 255 - color.getGreen();
                blue = 255 - color.getBlue();

                color = new Color(red, green, blue);

                img.setRGB(x, y, color.getRGB());
            }
        }
    }
}
