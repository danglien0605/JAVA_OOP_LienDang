package LAB04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        boolean isContinuning = true;
        List<Integer> arr = new ArrayList<>();
        while (isContinuning) {
            System.out.println("=========Menu===========");
            System.out.println("1. Add number into arrayList");
            System.out.println("2. Print Number");
            System.out.println("3. Get Maximum number");
            System.out.println("4. Get Minimum number");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Please input number from 1 to 6");
            int userInput = sc.nextInt();
            if (userInput == 5) {
                isContinuning = false;
            } else {
                switch (userInput) {
                    case 1:
                        System.out.println("Please input a number");
                        int number = sc.nextInt();
                        arr.add(number);
                        break;
                    case 2:
                        if (arr.size() == 0) {
                            System.out.println("You have not inputed any number");
                        } else {
                            System.out.println("Elements of Array is: " + arr.toString());
                        }
                        break;
                    case 3:
                        if (arr.size() == 0) {
                            System.out.println("You have not inputed any number");
                        } else {
                            arr.sort((o1, o2) -> o1 - o2);
                            System.out.println("Maximum number is: " + arr.get(arr.size() - 1));
                        }
                        break;
                    case 4:
                        if (arr.size() == 0) {
                            System.out.println("You have not inputed any number");
                        } else {
                            arr.sort((o1, o2) -> o1 - o2);
                            System.out.println("Minimum number is: " + arr.get(0));
                        }
                        break;
                    case 5:
                        isContinuning = false;
                    default:
                        System.out.println("Please input valid number");
                }
            }
        }

    }
}
