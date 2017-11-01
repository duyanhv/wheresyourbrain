package brain.playershape;

import bases.GameObject;
import bases.ImageRenderer;
import bases.Renderer;
import bases.physics.BoxCollider;
import bases.physics.PhysicsBody;
import brain.input.InputManager;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by duyanh on 11/1/17.
 */
public class PlayerLeftShape extends GameObject implements PhysicsBody {
    BoxCollider boxCollider;

    public ArrayList<Renderer> listShape;

    int count = 0;

    int COUNT_MAX = 2;

    Renderer shape1;

    Renderer shape2;

    boolean changeDisabled;

    final int COOL_DOWN_TIME = 10;
    int coolDownCount;

    public PlayerLeftShape(){

        listShape = new ArrayList<>();

        position.set(128,500);

        boxCollider = new BoxCollider(20,20);

        shape1 = new ImageRenderer("assets/shape/circle.png");

        shape2 = new ImageRenderer("assets/shape/Rectangle.png");

        this.renderer = shape1;

        listShape.add(shape1);

        listShape.add(shape2);





    }

    public void run(){
        changeShape();

        boxCollider.position.set(this.position);
    }

    private void changeShape(){
        InputManager inputManager =  InputManager.instance;
//        inputManager.jPressed = false;

        if (changeDisabled){
            coolDownCount++;
            if(coolDownCount >= COOL_DOWN_TIME){
                changeDisabled = false;
                coolDownCount = 0;
            }
            return;

        }

        if(inputManager.fPressed){
            count++;

            for(int i = 0; i < listShape.size(); i++){
                if((i+1) == count){
                    this.renderer = listShape.get(i);
                }
            }

            if(count == COUNT_MAX){
                reset();
            }

            changeDisabled = true;

        }
    }

    private void reset(){
        count = 0;
    }

    public void getHit(){
        isActive = false;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return null;
    }

    @Override
    public void setIsActive(boolean isActive) {

    }
}
