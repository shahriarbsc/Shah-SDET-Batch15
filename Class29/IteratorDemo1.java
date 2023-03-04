package Class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(10.0);
        numbers.add(15.2);

        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        // the loop wont run as in error.
        // int x;

        //  numbers.removeIf(x -> x > 11);  // lambda expression
        // we get the object by adding new

        // getting the object of interior

        Iterator<Double> iterator = numbers.iterator(); // calling a iterator method
/*
        System.out.println(iterator.hasNext());
// iterator has internal pointer
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(numbers);*/

        // hasNext keeps on returning true as long as there are elements left to be iterated/
        while (iterator.hasNext()){  // has next method is used here as a loop

         double number = iterator.next();
         if(number>11){
             iterator.remove();
         }

        }
        System.out.println(numbers);

    }
}
