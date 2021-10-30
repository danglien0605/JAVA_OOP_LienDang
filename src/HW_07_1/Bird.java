package HW_07_1;

public class Bird extends Animal{
    static{
        maxSpeed = 75;
    }
    public Bird(String name) {
        super(name);
    }

    @Override
    public boolean isFlyAble() {
        return true;
    }

    @Override
    public int getRandomSpeed() {
        return 0;
    }
}
