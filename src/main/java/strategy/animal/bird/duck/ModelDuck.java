package strategy.animal.bird.duck;

import strategy.animal.bird.behavior.BirdNoFly;
import strategy.animal.bird.behavior.Quack;

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
