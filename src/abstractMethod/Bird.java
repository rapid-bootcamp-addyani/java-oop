package abstractMethod;

public class Bird extends Animal{
    public Bird(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The bird "+ name+", can't run");
    }

    @Override
    void canEat() {
        System.out.println("bird can eat cereals");
    }
}
