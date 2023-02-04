package Class19;

public class ThisKeyword {

    int a, b;
    ThisKeyword(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public void sum(int a, int b){   //void mans here no return
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables ="+(this.a+this.b));

    }

    void hello(){
        System.out.println("hello batch 15");
    }
    void howAreYou(){

        System.out.println("How are you batch 15");
    }

    void greetings(){ // method inside methods

        this.hello(); //this keyword refers to the CURRENT instance methods
        this.howAreYou(); // making a call on to constructor this().
    }


    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(10, 20);

        obj.sum(  100, 200);
//------------------------------------------

        obj.greetings();

    }
}

