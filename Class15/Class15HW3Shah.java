package Class15;

public class Class15HW3Shah {

//3) Create a method that will print whether given String is palindrome or not.

    // return=boolean
    // name of the method=palindrome
    //parameter=String input
    Boolean palindrome(String str) {
        StringBuilder shah = new StringBuilder(str);
        if (str.equals(shah.reverse().toString())) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {

        Class15HW3Shah shah3 = new Class15HW3Shah();
        String entry = "Shah";
        System.out.println(entry + " is a palindrome? " + shah3.palindrome(entry));

    }
    }