package LAB05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<Integer, String> inf = new HashMap<Integer, String>();
        inf.put(0, "");
        boolean isContinue = true;
        int inputNumber;
        int ID = 0;
        String name = "";
        boolean isSame = false;
        Scanner sc = new Scanner(System.in);
        while (isContinue) {

            System.out.println("=======MENU===========");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");
            inputNumber = sc.nextInt();
            if (inputNumber == 0) {
                isContinue = false;
            } else {
                switch (inputNumber) {
                    case 1:
                        System.out.println("Please input student ID ");
                        ID = sc.nextInt();
                        System.out.println("Please input student name ");
                        name = sc.next();
                        Set<Integer> keySet = inf.keySet();
                        for (Integer key : keySet) {
                            if (key == ID) {
                                System.out.println("duplicate");
                                isSame = true;
                                break;
                            }
                        }
                        if (!isSame) {
                            inf.put(ID, name);
                            System.out.println(inf);
                        }
                        break;
                    case 2:
                        System.out.println("Please input ID number");
                        ID = sc.nextInt();
                        System.out.println("Student name is: " + inf.get(ID));
                        break;
                    default:
                        System.out.println("Please input valid number");


                }
            }

        }
    }
}
