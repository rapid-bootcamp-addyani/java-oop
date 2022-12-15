package abstractMethod;

public class Frog extends Animal{
    public Frog(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The frog "+ name+", can't run");
    }

    @Override
    void canEat() {
        System.out.println("Frog can eat insect");
    }
}
