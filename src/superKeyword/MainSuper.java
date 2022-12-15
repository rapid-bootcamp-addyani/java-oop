package superKeyword;

public class MainSuper {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int value1 = rectangle.getCorner();
        System.out.println(value1);

        int value2 = rectangle.getParentCorner();
        System.out.println(value2);

        boolean bool1 = rectangle.isValid();
        System.out.println(bool1);

        String string1 = rectangle.getName();
        System.out.println(string1);
    }
}
