import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by duyanh on 10/31/17.
 */
public class GameWindow extends JFrame {
    GameCanvas canvas;

    long lastTimeUpdate;

    public GameWindow(){
        this.setSize(384,600);
        this.canvas = new GameCanvas();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setResizable(false);
        this.setContentPane(canvas);
        this.setVisible(true);
        this.setTitle("WhErE'S yUor BrAiN??");
        lastTimeUpdate = System.nanoTime();
    }

    public void gameLoop(){
        while(true){
            long currentTime = System.nanoTime();

            if(currentTime - lastTimeUpdate >= 17000000){
                canvas.run();
                canvas.render();
                lastTimeUpdate = currentTime;
            }
        }
    }
}
