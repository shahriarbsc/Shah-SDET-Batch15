package Class32;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Create a method checkUserName that will throw a runtime exception. Method should through an exception when
entered username`s characters.
*/
public class Class32HW4 {

    public static void checkUserName(String userName) {
        if (userName.length() < 7) {
            throw new RuntimeException("Username is less than 7 characters.");
        }
    }

    public static void main(String[] args) {

        String userName = "Shah";
        try {
            checkUserName(userName);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
