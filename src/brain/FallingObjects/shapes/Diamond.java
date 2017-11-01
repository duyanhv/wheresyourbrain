package brain.FallingObjects.shapes;


import bases.ImageRenderer;
import bases.Utils;
import brain.FallingObjects.FallingObjects;

import java.awt.image.BufferedImage;

public class Diamond extends FallingObjects {
    BufferedImage image;

    public Diamond(){
        super();
        this.renderer = new ImageRenderer("assets/shape/circle.png");
    }
}
