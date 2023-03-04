package Class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo8 {

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.

    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");


        // Set<Map.Entry<String,String> entrySet=countries.entrySet(); replacing var key word // only works java10 version

        // delete the entry we use lambda

        var entrySet = countries.entrySet();

        for (var entry : entrySet) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        var iterator = countries.entrySet().iterator();

        while (iterator.hasNext()) {

            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

}
