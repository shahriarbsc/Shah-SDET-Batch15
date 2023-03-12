package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class30HW1 {
    public static void main(String[] args) {


//    Create a map of Best Buy store. Place
//    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc.)
//    Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer, String> bestBuy = new HashMap<>();

        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(5500456, "Amp");
        bestBuy.put(8032574, "Speakers");

        Set<Map.Entry<Integer, String>> entrySet = bestBuy.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet
        ) {
            System.out.println("Item ID: " + entry.getKey() + "." + " Item name: " + entry.getValue() + ".");
        }

    }
}

