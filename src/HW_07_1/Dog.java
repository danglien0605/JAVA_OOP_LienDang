package HW_07_1;

public class Dog  extends  Animal{
    public Dog(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}
