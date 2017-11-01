import bases.GameObject;
import bases.Vector2D;
import brain.BackGround;
import brain.FallingObjects.Spawner;
import brain.fallingshape.RightShape;
import brain.playershape.Player;
import brain.playershape.PlayerLeftShape;
import brain.playershape.PlayerRightShape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by duyanh on 10/31/17.
 */
public class GameCanvas extends JPanel {

    BufferedImage backBuffer;
    Graphics backGraphics;

    Spawner leftSpawner = new Spawner(new Vector2D(128,-20));

    Spawner rightSpawner = new Spawner(new Vector2D(256,-20));

    public GameCanvas(){
        backBuffer = new BufferedImage(384,600, BufferedImage.TYPE_INT_ARGB);

        backGraphics = backBuffer.getGraphics();

        GameObject.add(new BackGround());

        GameObject.add(new PlayerRightShape());
//
        GameObject.add(new PlayerLeftShape());

        GameObject.add(leftSpawner);

        GameObject.add(rightSpawner);

//        GameObject.add(new Player());
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
