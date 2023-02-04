package Class19;



public class ConstructorChain {

    // non argument constructor
    ConstructorChain() {
        System.out.println("I am non argument constructor");
    }
    ConstructorChain(String str) {
        this(); //making a call to non argument constructor

        // this() -> ALWAYS must to be on the first line
        System.out.println(str);

    }

    // value passing must be signature of the constructors
    ConstructorChain(String str, int number) {

        this(str);
        System.out.println("This is constructor with int parameter"+number);

    }

    public static void main(String[] args) {

        ConstructorChain obj = new ConstructorChain(    "hello", 20);
        System.out.println(" ---End of the code---------");
    }

}
