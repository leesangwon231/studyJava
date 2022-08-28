package ten;

public class AnimalController {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setData("야몽이", "리트리버", 4, 30, false);
        dog.move();
        dog.eatFood();
    }
    
}
