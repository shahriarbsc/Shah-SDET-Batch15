package Class15;

public class Class15HW2Shah {

    //2) Create a method that will take a number and prints whether the number is even or odd.


    // return=int
    // name of the method EvenOdd
    //parameter
    String evenOdd(int num) {
        if (num % 2 == 0) {
            return num + " is Even";
        } else {
            return num + " is odd";

        }
    }

    public static void main(String[] args) {
        Class15HW2Shah Shah2 = new Class15HW2Shah();

        System.out.println(Shah2.evenOdd(6));
    }
}
