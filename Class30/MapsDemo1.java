package Class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap= new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        //studentsMap.put(1, "Anush"); // duplicated are not allowed

        //note: we have to write a loop to remove a entry



        System.out.println(studentsMap);

        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove( 1));
        System.out.println(studentsMap);

        studentsMap.replace(2,"Asli");

        System.out.println(studentsMap);
    }


}
