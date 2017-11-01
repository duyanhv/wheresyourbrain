package brain.FallingObjects.shapes;


import bases.ImageRenderer;
import bases.Utils;
import brain.FallingObjects.FallingObjects;

import java.awt.image.BufferedImage;

public class Triangle extends FallingObjects {
    BufferedImage image;

    public Triangle(){
        super();
        this.renderer = new ImageRenderer("assets/shape/circle.png");
    }
}
