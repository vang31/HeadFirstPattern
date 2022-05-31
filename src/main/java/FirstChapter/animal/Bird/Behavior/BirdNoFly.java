package FirstChapter.animal.Bird.Behavior;

public class BirdNoFly implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
