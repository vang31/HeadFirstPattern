package strategy.animal.bird.duck;

import strategy.animal.bird.behavior.Quack;
import strategy.animal.bird.behavior.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real mallard Duck!");
    }
}
