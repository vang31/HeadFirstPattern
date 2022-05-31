package FirstChapter.animal.Bird.Behavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Quack-Quack");
    }
}
