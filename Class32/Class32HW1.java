package Class32;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
How would you handle inputMismatchException? Input Mismatch Exception when user enters mismatch value then program expected?


*/
public class Class32HW1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an int value: ");
            int number = sc.nextInt();
            System.out.println("You enter: " + number);
        } catch (
                InputMismatchException e) {
            System.out.println("Invalid input, Please enter int value");
        }
    }
}
