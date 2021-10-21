package HW_06_1;

public class Dog extends Animal{
    static {
        name = "Dog";
        maxSpeed = 60;
    }

    public Dog() {
    }

    public Dog(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
}
