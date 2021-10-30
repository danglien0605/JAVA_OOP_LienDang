package HW_07_1;

import java.security.SecureRandom;

public class Tiger extends  Animal{
    static {
        maxSpeed = 160;
    }
    public Tiger(String name) {
        super(name);
    }

    @Override
    public boolean isFlyAble() {
        return false;
    }

    @Override
    public int getRandomSpeed() {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }
}
