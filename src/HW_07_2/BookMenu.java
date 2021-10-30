package HW_07_2;

import java.util.Scanner;

import static HW_07_2.Books.addBook;
import static HW_07_2.Books.retrieveBook;

public class BookMenu {
    public static void main(String[] args) {
        System.out.println("Wellcome !");
        boolean isContinue = true;
        while (isContinue){
            System.out.println("===Menu===");
            System.out.println("1.Add Book");
            System.out.println("2.Retrieve");
            System.out.println("3.Exit");
            System.out.println("Please choose your option");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case(1):
                    addBook();
                    break;
                case(2):
                    retrieveBook();
                    break;
                case(3):
                    System.out.println("See you again!");
                    isContinue = false;
                    break;
            }

        }

    }
}
