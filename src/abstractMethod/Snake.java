package abstractMethod;

public class Snake extends Animal{
    public Snake(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The snake "+ name+", can't run");
    }

    @Override
    void canEat() {
        System.out.println("Snake can eat mouse");
    }
}
