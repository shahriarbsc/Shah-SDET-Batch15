package Class30;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class Class30HW4 {
    public static void main(String[] args) {


/*    Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection. */


            LinkedHashSet<String> stringSet = new LinkedHashSet<>();

            stringSet.add("Diamonds");
            stringSet.add("are");
            stringSet.add("forever");
            stringSet.add("and");
            stringSet.add("sky");
            stringSet.add("is the limit");

            for (String str : stringSet) {

                System.out.print(str + " ");
            }
        }
    }
