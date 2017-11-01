package brain.FallingObjects;


import bases.FrameCounter;
import bases.GameObject;
import bases.Vector2D;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Spawner extends GameObject {
    public Vector2D position;
    Random rdm = new Random();
    int index;

    FrameCounter frameCounter = new FrameCounter(120);





    public Spawner(Vector2D position){
        this.position = position;
    }
    public void spawn(int num){
        FallingObjects object = FallingObjects.create(num);
//        if (object == null) {
//            System.out.println("Object null");
//        } else {
//            if (object.position == null) {
//                System.out.println("position null");
//            }
//        }
        object.position.set(this.position);

        GameObject.add(object);
    }
    public void run(){
        if(frameCounter.run()){
            index = ThreadLocalRandom.current().nextInt(0,4);
            System.out.println(index+".");


            spawn(index);
            frameCounter.reset();
        }

    }
}
