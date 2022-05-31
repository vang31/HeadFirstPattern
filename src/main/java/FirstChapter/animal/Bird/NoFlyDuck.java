package FirstChapter.animal.Bird;

public class NoFlyDuck implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
