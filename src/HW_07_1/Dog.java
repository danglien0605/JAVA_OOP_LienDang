package HW_07_1;

import java.security.SecureRandom;

public class Dog  extends  Animal{

        static{
            maxSpeed = 100;
        }


    public Dog(String name) {
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
