package HW_07_1;

public class Bird extends Animal{
    public Bird(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }
}
