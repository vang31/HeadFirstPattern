package FirstChapter.animal.Bird.Duck;

import FirstChapter.animal.Bird.Behavior.FlyWithWings;
import FirstChapter.animal.Bird.Behavior.Quack;

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
