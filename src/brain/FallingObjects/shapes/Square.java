package brain.FallingObjects.shapes;


import bases.ImageRenderer;
import bases.Utils;
import brain.FallingObjects.FallingObjects;

import java.awt.image.BufferedImage;

public class Square extends FallingObjects {
    BufferedImage image;

    public Square(){

        super();
        System.out.println("?");
        this.renderer = new ImageRenderer("assets/shape/circle.png");
    }
}
