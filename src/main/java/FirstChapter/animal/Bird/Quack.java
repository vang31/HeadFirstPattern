package FirstChapter.animal.Bird;

public class Quack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Quack-Quack");
    }
}