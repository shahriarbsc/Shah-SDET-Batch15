package Class17;
/*
Write in java class that will have a constructor: one with parameters and second without any parameters. Create a separate Test
class where you will execute constructors 1 by 1.

*/
public class Class17HW1 {
    String name;
    String type;
    double weight;

    Class17HW1() {
        System.out.println("This is without any parameters");
    }

    Class17HW1(String model, int price) {

        System.out.println("This is with a Strings and an int parameter");
    }
}

class Class17HW1Tester {

    public static void main(String[] args) {
        Class17HW1 homework1 = new Class17HW1();
        homework1.name = "Java";
        homework1.type = "Constructor";

        System.out.println("----------------------------------");

        Class17HW1 homework2 = new Class17HW1("IPhone 13 Pro Max", 1000);
        homework2.name = "IPhone";
        homework2.weight = 10.3;


    }

}


