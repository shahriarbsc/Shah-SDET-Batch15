package Class32;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Create a java method to check age eligibility that will throw a run time exception. Method should throw an exception
age is less than 18
*/
public class Class32HW3 {
    public static void checkAgeEligibility(int age) {
        if (age < 18) {
            throw new RuntimeException("Age is less than 18.");
        }
    }

    public static void main(String[] args) {

        int age = 17;
        try {
            checkAgeEligibility(age);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}

