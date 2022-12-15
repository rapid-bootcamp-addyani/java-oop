package PersonData;

public class PersonData {
    //List Property
    public Integer id;
    public String name;
    public String gender;
    public String address;
    public int age;

    public void sayHello(){
        System.out.println("Hello, my name is " + name + ", and I live at "+ address);
        System.out.println("I am a "+ age + " years old");
    }
    public PersonData(){

    }
    public PersonData(Integer id, String name, String gender, String address, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

}
