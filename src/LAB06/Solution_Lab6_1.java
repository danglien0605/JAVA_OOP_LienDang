package LAB06;

import java.util.Scanner;

public class Solution_Lab6_1 {
    public static void main(String[] args) {
        String str = "2hrs and 5 minutes";
        String hour = str.substring(0, 1);
        String minute = str.substring(9,10);
        int total = Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
        System.out.println(total);
    }
}
