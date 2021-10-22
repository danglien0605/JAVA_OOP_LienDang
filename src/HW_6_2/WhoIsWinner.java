package HW_6_2;

import java.util.*;

public class WhoIsWinner {
    public static void main(String[] args) {
        String theWinner = "";
        Animal horse = new Animal.Builder()
                .whatIsName("Horse")
                .isFlyAble(false)
                .whatIsMaxSpeed(100)
                .build();
       Animal tiger = new Animal.Builder()
               .whatIsName("Tiger")
               .isFlyAble(false)
               .whatIsMaxSpeed(75)
               .build();
       Animal bird = new Animal.Builder()
               .whatIsName("Bird")
               .isFlyAble(true)
               .whatIsMaxSpeed(80)
               .build();

        Map<String, Integer> dataMap = new LinkedHashMap<>();
        dataMap.put(horse.getName(), horse.getRandomSpeed());
        dataMap.put(tiger.getName(), tiger.getRandomSpeed());
        dataMap.put(bird.getName(), bird.getRandomSpeed());

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
