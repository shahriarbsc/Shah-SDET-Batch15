package Class28;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();

        names.add("Artem");
        names.add("Elvira");
        names.add("Tamanna");
        names.add("Temmuz");
        names.add("Sam");

        System.out.println(names);


        for(String name:names){
            System.out.println(name);

        }

    }

}
