package superKeyword;

public class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
    boolean isValid(){
        return false;
    }

    String getName(){
        return "Add";
    }

    void sayHello(){

    }


}
