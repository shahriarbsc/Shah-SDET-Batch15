package Class28;

import java.util.ArrayList;

public class Class28HW1 {
    public static void main(String[] args) {
 /* 1) Create an ArrayList that will store 5 names into it.
          Find out whether the given ArrayList is empty or not?
          Check whether the specific name is present in an ArrayList or not?
          Find the size of your arrayList and print all values from that
*/
            ArrayList<String> names=new ArrayList<>();
            names.add("Shah");
            names.add("Shupa");
            names.add("Victor");
            names.add("Razzaqi");
            names.add("Yuliya");

            System.out.println(names.isEmpty());
            System.out.println(names.contains("Shupa"));
            System.out.println(names.size());

            System.out.println(names);


            for (String name:names) {
                System.out.print(name+",");

            }

    }
}
