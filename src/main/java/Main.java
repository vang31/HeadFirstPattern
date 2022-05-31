import strategy.animal.bird.behavior.RocketFlyDuck;
import strategy.animal.bird.duck.Duck;
import strategy.animal.bird.duck.MallardDuck;
import strategy.animal.bird.duck.ModelDuck;

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
