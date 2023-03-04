package Class24;

public class FinalDemo {
    public static void main(String[] args) {

        final int num; // we have created a constant variables . not assigned
        num=20;
        // num=30; not possible because the variables is declared final

    }
   final void noOneShouldOverrideIt(){

        System.out.println("This method should never be overridden otherwise it might break the code base");
    }
}

class Nelson extends FinalDemo{


   /* void noOneShouldOverrideIt() {     //cant override this method as it is declared as final
        System.out.println("Let me do that");

    }*/
}
