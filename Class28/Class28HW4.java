package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Class28HW4 {
    public static void main(String[] args) {


        /* 4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("RedBull");
        drinks.add("IceTea");
        drinks.add("Coffee");
        drinks.add("Soda");

        for (String drink : drinks) {

            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(drinks.indexOf(drink), "Water");
            }

        }
        System.out.println("After replacing" + drinks);

    }
}

