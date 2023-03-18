package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Class28HW2 {
    public static void main(String[] args) {

        /* 2)Create an arraylist of cars and retrieve all the values using 3 different ways. */

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Dodge");
        cars.add("Lamrogini");

        // 1st way

        System.out.println(cars);
        System.out.println("________________");

        // 2nd way

        for (String name : cars) {
            System.out.println(name);
        }
        System.out.println("__________________");
        // 3rd way

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");

        }
        System.out.println();
        System.out.println("___________________");

        // 4rd way

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}