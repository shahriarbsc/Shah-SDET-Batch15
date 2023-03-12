package Class30;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Class30HW5 {
    public static void main(String[] args) {

/*    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers */


        List<Integer> integers = new LinkedList<>();
        integers.add(70);
        integers.add(60);
        integers.add(50);
        integers.add(30);
        integers.add(20);
        integers.add(10);
        integers.add(0);

        int sum = 0;
        for (Integer i : integers) {
            sum = sum + i;
        }
        System.out.println("The sum of all integers is: " + sum);
    }
}
