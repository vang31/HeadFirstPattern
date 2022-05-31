package strategy.animal.bird.behavior;

public class BirdNoFly implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
