package bases;

import java.awt.*;
import java.util.Vector;

/**
 * Created by duyanh on 10/31/17.
 */
public class GameObject {
    public Vector2D position;
    
    public Renderer renderer;
    
    public boolean isActive;
    
    static Vector<GameObject> gameObjects = new Vector<>();
    
    static Vector<GameObject> newGameObjects = new Vector<>();

    public GameObject(){
        position = new Vector2D();
        isActive = true;
    }
    
    public static void runAll(){
        for(GameObject gameObject : gameObjects){
            if(gameObject.isActive){
                gameObject.run();
            }
        }
        gameObjects.addAll(newGameObjects);
        newGameObjects.clear();
    }

    public static void renderAll(Graphics g){
        for(GameObject gameObject : gameObjects){
            if(gameObject.isActive){
                gameObject.render(g);
            }
        }
    }

    private void render(Graphics g) {
        if(renderer != null){
            renderer.render(g,position);
        }
    }

    private void run() {
    }

    public static void add(GameObject gameObject){
        newGameObjects.add(gameObject);
    }
}
