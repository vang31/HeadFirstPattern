package strategy.animal.bird.behavior;

public class RocketFlyDuck implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I'm flying with a Rocket!!!");
    }
}
