package brain;

import bases.GameObject;
import bases.ImageRenderer;

import java.net.URL;

/**
 * Created by duyanh on 10/31/17.
 */
public class BackGround extends GameObject {

    public BackGround(){
        position.set(0,-2540);
        this.renderer = new ImageRenderer("assets/image/space.jpg");
    }
}
