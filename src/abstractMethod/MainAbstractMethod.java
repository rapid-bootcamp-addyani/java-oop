package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.run();
        cat.canEat();

        Horse horse = new Horse("Baidu");
        horse.run();
        horse.canEat();

        Fish fish = new Fish("Nemo");
        fish.run();
        fish.canEat();

        Snake snake = new Snake("Python");
        snake.run();
        snake.canEat();

        Frog frog = new Frog("Rio");
        frog.run();
        frog.canEat();

        Bird bird = new Bird("Owl");
        bird.run();
        bird.canEat();
    }

}
