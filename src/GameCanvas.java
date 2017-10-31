import bases.GameObject;
import brain.BackGround;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by duyanh on 10/31/17.
 */
public class GameCanvas extends JPanel {

    BufferedImage backBuffer;
    Graphics backGraphics;

    public GameCanvas(){
        backBuffer = new BufferedImage(400,600, BufferedImage.TYPE_INT_ARGB);

        backGraphics = backBuffer.getGraphics();

        GameObject.add(new BackGround());
    }




    public void run() {

        GameObject.runAll();
    }

    public void render() {

        GameObject.renderAll(backGraphics);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(backBuffer,0,0,null);
    }
}
