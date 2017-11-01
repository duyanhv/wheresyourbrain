package brain.FallingObjects.shapes;

import bases.ImageRenderer;
import bases.Utils;
import brain.FallingObjects.FallingObjects;

import java.awt.image.BufferedImage;

public class Circle extends FallingObjects {
    BufferedImage image;

    public Circle(){
        super();

        this.renderer = new ImageRenderer("assets/shape/circle.png");
    }


}
