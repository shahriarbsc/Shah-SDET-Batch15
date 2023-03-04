package Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);

        System.out.println(numbers);

// write some logic to remove duplicates from above list
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);



        TreeSet<String> aList = new TreeSet<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String> uniqueList = new LinkedHashSet<>(aList);
        System.out.println(uniqueList);



       // How can you remove all duplicates from ArrayList?








    }
}
