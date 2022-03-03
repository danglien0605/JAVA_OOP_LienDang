package LAB03;

import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        System.out.print("Input size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        int count = 0;

        System.out.println("Enter elements of array, please: ");
        for(int i =0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: " + Arrays.toString(arr));

        for(int i =0; i<size; i++){
            if(arr[i] % 2 == 0){
                count ++;
            }

        }
        System.out.println("Even number(s) in an integer array is: " + count);
        System.out.println("Old number(s) in an integer array is: " + (size-count));
        //======================================
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < size; i++){
            if (max < arr[i]){
                max = arr[i];
            }else  if(min > arr[i] ){
                min = arr[i];
            }
    }
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}
