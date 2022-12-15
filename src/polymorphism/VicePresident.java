package polymorphism;

public class VicePresident extends Manager{
    public VicePresident(String name) {
        super(name);
    }

    void sayHello(){
        System.out.println("Hello Manager" + this.name);
    }
}
