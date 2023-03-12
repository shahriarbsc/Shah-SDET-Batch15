package Class30;

import java.util.Map;
import java.util.TreeMap;

public class Class30HW2 {

//    Create a Person class with following private fields: name, lastName, age, salary.
//    Variables should be initialized through constructor.
//    Inside the class also create a method to print user details.
//    In Test Class create a Map that will store key in ascending order.
//    In that map store personId and a Person Object. Print each object details.

    String name;
    String lastName;
    int age;
    double salary;

    public Class30HW2(String name, String lastName, int agr, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = agr;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

    class Class30HW2Tester {

        public static void main(String[] args) {

            Class30HW2 p1 = new Class30HW2("Tamanna", "Ferdoush", 32, 30000.00);
            Class30HW2 p2 = new Class30HW2("Shahriar", "Shah", 41, 50000.00);
            Class30HW2 p3 = new Class30HW2("Joba", "Tasnia", 27, 60000.00);

            Map<Integer, Class30HW2> personMap = new TreeMap<>();
            personMap.put(1, p1);
            personMap.put(2, p2);
            personMap.put(3, p3);

            for (Map.Entry<Integer, Class30HW2> entry : personMap.entrySet()) {
                System.out.println("Person ID: " + entry.getKey());
                entry.getValue().printInfo();
                System.out.println();

            }
        }
    }



