package com.ites.sistemas;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SimpleImage {

    private String imageUrl;
    private BufferedImage img;

    public SimpleImage(String imageUrl) throws IOException {
        this.imageUrl = imageUrl;
        File file = new File(imageUrl);
        img = ImageIO.read(file);
    }

    public void negative() {
        int pixel, red, green, blue;
        for (int y = 0; y < img.getHeight(); y++) { // filas
            for (int x = 0; x < img.getWidth(); x++) { // columnas
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
    public void save(String outputUrl) throws IOException {
        File outputFile = new File(outputUrl);
        ImageIO.write(img, "JPG", outputFile);
    }
}
