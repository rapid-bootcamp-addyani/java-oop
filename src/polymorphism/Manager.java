package polymorphism;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    void sayHello(){
        System.out.println("Hello Vice President" + this.name);
    }

}
