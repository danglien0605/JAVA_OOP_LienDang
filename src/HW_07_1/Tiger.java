package HW_07_1;

public class Tiger extends  Animal{
    public Tiger(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }
}
