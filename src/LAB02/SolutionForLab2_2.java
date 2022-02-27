package LAB02;

import java.util.Scanner;

public class SolutionForLab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        if(num%2 ==0){
            System.out.printf("%s is even number", num);
        }else {
            System.out.printf("%s is an odd", num);
        }
    }
}
