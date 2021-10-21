package HW_06_1;

import java.security.SecureRandom;

public class Animal {
    static String name;
    static int maxSpeed;


    public Animal() {
    }

    public static String getName() {
        return name;
    }

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public static int speed(){
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }

}
