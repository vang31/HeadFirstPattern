package FirstChapter.animal.Bird.Duck;

import FirstChapter.animal.Bird.Behavior.BirdNoFly;
import FirstChapter.animal.Bird.Behavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new BirdNoFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model Duck!!!");
    }
}
