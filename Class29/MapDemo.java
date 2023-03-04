package Class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {



        // there is no index type data in map
       // HashMap<String, Integer> groceries = new HashMap<>();
       //LinkedHashMap<String, Integer> groceries = new LinkedHashMap<>();

        TreeMap<String,Integer> groceries =new TreeMap<>();



        groceries.put("Eggs", 10);
        groceries.put("Milk", 5);
        groceries.put("Bread", 5);
        groceries.put("Rice", 6);
        groceries.put("Meat", 5);
        groceries.put("Soap", 5);


        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
       System.out.println(groceries.remove("Meat"));

        System.out.println(groceries);
    }
}
