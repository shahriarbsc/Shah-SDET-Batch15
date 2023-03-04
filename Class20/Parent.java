package Class20;

public class Parent {

    String name;
    static String lastName;

   /* private Parent() {
        System.out.println("I am a parent class constructor");

    }
*/
    public static void main(String[] args) {
        Parent p = new Parent();

    }

    public void hello() {

        System.out.println("public method hello from parent class");

    }

    protected static void bye() {
        System.out.println("protected method bye from parent class");

    }

    private static void money() {
        System.out.println("private method money from parent class");


    }
}