package Class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();

        fruit.put("Apple", 1.99);
        fruit.put("Orange", 2.99);
        fruit.put("Banana", 4.99);
        fruit.put("Kiwi", 0.99);
        fruit.put("Apple", 3.99);  // hashMap will retain the last value of a duplicate

        fruit.put(null, null);
        System.out.println(fruit);

        HashMap<String, Double> makeup = new HashMap<>();

        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("mascara", 70.0);
        makeup.put("eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);

        HashMap<String, Double> groceries = new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);
    }

}
