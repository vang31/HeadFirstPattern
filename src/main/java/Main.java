import FirstChapter.animal.Bird.Behavior.RocketFlyDuck;
import FirstChapter.animal.Bird.Duck.Duck;
import FirstChapter.animal.Bird.Duck.MallardDuck;
import FirstChapter.animal.Bird.Duck.ModelDuck;

public class Main {
    public static void main(String[] arg) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new RocketFlyDuck());
        modelDuck.performFly();
    }
}
