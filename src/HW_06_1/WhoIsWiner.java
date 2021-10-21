package HW_06_1;

import java.sql.Array;
import java.util.*;

import static sun.swing.MenuItemLayoutHelper.max;

public class WhoIsWiner {
    public static void main(String[] args) {
        String theWinner = "";
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Map<String, Integer> dataMap = new HashMap<>();
        List<Animal> animals = Arrays.asList(horse, tiger, dog);
        for (Animal animal : animals) {
            System.out.printf("%s 'speed is: %d%n", animal.getClass().getSimpleName(), animal.speed());
            dataMap.put(animal.getClass().getSimpleName(), animal.speed());

        }
        int max = Collections.max(dataMap.values());
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            if (entry.getValue() == max) {
                theWinner = entry.getKey();
            }
        }
        System.out.printf("The winner is %s", theWinner);
    }
}
