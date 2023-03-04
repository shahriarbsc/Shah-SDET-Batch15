package Class27;

public class BoxingDemo {
    public static void main(String[] args) {
        int number = 15;
        printData(number);  // auto boxing= conversion of primitive sata type
// here is int is a primitive sata type and Integer is a class. its only happens in Wrapper class


        Integer f=10; // autoBoxing
        int number2=f;

    }

    public static void printData(Integer number) {

        System.out.println(number);


    }

}
