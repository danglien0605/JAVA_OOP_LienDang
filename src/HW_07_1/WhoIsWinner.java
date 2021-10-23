package HW_07_1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WhoIsWinner {
    public static void main(String[] args) {
        String theWinner = "";
        Animal tiger = new Tiger("Tiger",100);
        Animal dog = new Dog("Dog", 50);
        Animal bird = new Bird("Bird", 75);


        Map<String, Integer> dataMap = new LinkedHashMap<>();
        dataMap.put(tiger.getName(), tiger.getRandomSpeed());
        dataMap.put(bird.getName(), bird.getRandomSpeed());
        dataMap.put(dog.getName(), dog.getRandomSpeed());

        dataMap.forEach((key, value) -> System.out.printf("%s 'speed is: %d%n", key, value));
        int max = Collections.max(dataMap.values());
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            if (entry.getValue() == max) {
                theWinner = entry.getKey();
            }
        }
        System.out.printf("The winner is %s", theWinner);
    }
}
