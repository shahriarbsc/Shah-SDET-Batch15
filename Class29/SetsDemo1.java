package Class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetsDemo1 {

    public static void main(String[] args) {

/*    List<String> list = new LinkedList<>();

    list.add("Java");
    list.add("Tea");
    list.add("Coke");
    list.add("Pepsi");
    list.add("Milk");
        System.out.println(list);
*/


        // HashSet does not allow duplicate values and it does not maintain insertion order.
        HashSet<String> fruit = new HashSet<>();

        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);









    }
}
