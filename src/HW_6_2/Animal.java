package HW_6_2;

import java.security.SecureRandom;
import java.util.Random;

public class Animal {
    private String name;
    private boolean flyAble;
    private int maxSpeed;

    public static class Builder {
        private String name;
        private boolean flyAble;
        private int maxSpeed;

        public Builder whatIsName(String name) {
            this.name = name;
            return this;
        }

        public Builder isFlyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public Builder whatIsMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Animal build() {
            Animal animal = new Animal();
            animal.name = this.name;
            animal.flyAble = this.flyAble;
            animal.maxSpeed = this.maxSpeed;

            return animal;

        }

    }
    private  Animal(){
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    public void setFlyAble(boolean flyAble) {
        this.flyAble = flyAble;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getRandomSpeed(){
        int randomSpeed = flyAble ? 0: new SecureRandom().nextInt(maxSpeed);
        return randomSpeed;
    }

}
