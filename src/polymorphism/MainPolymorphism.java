package polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Addyani");
        Manager manager = new Manager("Amirul");
        VicePresident vicePresident = new VicePresident("Fajar");

//        employee.sayHello();
//        manager.sayHello();
//        vicePresident.sayHello();
        sayHello(employee);
        sayHello(manager);
        sayHello(vicePresident);
    }

    public  static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Halo VP " + vicePresident.name);
        } else if (employee instanceof  Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Halo Manager " + manager.name);
        } else {
            System.out.println("Halo Employee " + employee.name);
        }
    }
}
