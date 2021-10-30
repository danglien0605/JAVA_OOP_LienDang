package HW_07_1;

import java.security.SecureRandom;

public abstract class Animal {
    private String name;
    protected  Boolean flyAble;
    static  int maxSpeed;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isFlyAble();

    public abstract int getRandomSpeed();



}
