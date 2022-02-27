package LAB02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SolutionForLab2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight: " );
        float weight = sc.nextFloat();

        System.out.print("Input hight: " );
        float hight = sc.nextFloat();
        float BMI = weight / (hight * 2);
        System.out.printf("BMI is: %f\n", BMI);

        if(BMI <=18.5){
            System.out.println("you're too skinny, you need to eat more");
        }else if(18.5 < BMI && BMI < 24.9){
            System.out.println("You are so beautiful, keep your weight !" );
        }else  if(25<= BMI && BMI <29.9){
            System.out.println("You are a bit fat. Need do exercise");
        }else {
            System.out.println("You are so fat. should eat healthy and do exercise everyday  " );
        }
    }

}
