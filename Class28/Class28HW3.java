package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Class28HW3 {
    public static void main(String[] args) {

        /* 3)Create an arrayList of words. Remove every word that ends with “e”.*/

            ArrayList<String> words=new ArrayList<>();
            words.add("Come");
            words.add("Remove");
            words.add("Self");
            words.add("House");
            words.add("Fox");

            words.removeIf(s -> s.endsWith("e"));
            System.out.println(words);

            // 2nd way

            Iterator<String> iterator=words.iterator();

            while (iterator.hasNext()){
                String s= iterator.next();
                if(s.endsWith("e")){
                    iterator.remove();
                }
            }
            System.out.println(words);
        }
    }
