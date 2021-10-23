package HW_07_1;

import java.security.SecureRandom;

public abstract class Animal {
    private String name;
    private boolean flyAble;
    private int maxSpeed;

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isFlyAble();
    public int getRandomSpeed(){
        if(isFlyAble()){
            return 0;
        }else {
            int randomSpeed = new SecureRandom().nextInt(maxSpeed);
            return randomSpeed;
        }

    }



}
