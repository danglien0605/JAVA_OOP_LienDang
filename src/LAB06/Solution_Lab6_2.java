package LAB06;

import java.util.Scanner;

public class Solution_Lab6_2 {
    public static void main(String[] args) {
        String correctPass = "password123";
        int count = 0;
        do {
            System.out.println("please input vaid password");
            Scanner sc = new Scanner(System.in);
            String enteredPass = sc.next();
            count++;
            if (enteredPass.equals(correctPass)) {
                System.out.println("Correct Password!");
                break;
            }
        } while (count < 3);


    }

}
