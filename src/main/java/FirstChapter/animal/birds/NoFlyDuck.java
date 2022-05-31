package FirstChapter.animal.birds;

public class NoFlyDuck implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
