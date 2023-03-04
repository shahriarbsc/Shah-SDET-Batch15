package Class20;

public class SuparClass {

    SuparClass() {
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuparClass {

    SubClass() {  // constructors

       // super();        // makes a call to the parent class constructors // the word Super refers to immidiate parent
        System.out.println("I am a child constructors");

    }

}

