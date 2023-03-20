package Class32;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/*
Create a static method that will return a List of Exceptions. Inside your method create objects of 4 exception classes using try and
catch blocks and store them inside your list. Call your method inside main and print name and details of all Exceptions objects.


*/
public class Class32HW2 {
        public static List<Exception> exceptionList () {
            List<Exception> exceptions = new ArrayList<>();

            try {
                int num = Integer.parseInt("xyz");
            } catch (NumberFormatException e) {
                exceptions.add(e);
            }

            try {
                int[] arr = new int[4];
                arr[4] = 20;
            } catch (ArrayIndexOutOfBoundsException e) {
                exceptions.add(e);
            }

            try {
                String str = null;
                str.length();
            } catch (NullPointerException e) {
                exceptions.add(e);
            }

            try {
                int a = 20, b = 0;
                int c = a / b;
            } catch (ArithmeticException e) {
                exceptions.add(e);
            }

            return exceptions;
        }

        public static void main (String[]args){
            List<Exception> exceptionList = exceptionList();
            for (Exception e : exceptionList) {
                System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
            }
        }
    }
