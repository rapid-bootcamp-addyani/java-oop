package abstractMethod;

public class Fish extends Animal{
    public Fish(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The fish "+ name+", can't run");
    }

    @Override
    void canEat() {
        System.out.println("Fish can eat meal");
    }
}
