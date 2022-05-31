package FirstChapter.animal.Bird.Behavior;

public class NoFlyDuck implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
