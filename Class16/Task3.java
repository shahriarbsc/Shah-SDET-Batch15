package Class16;

public class Task3 {
    /*
    3) Create a method that will print whether given String is palindrome or not.

    return type=void
     METHODS name= IsPalidrame
        //parameter=String inputStr
    {

    }
    example dad = dad true
        abc= cba false*/
    void isPalindrome(String str) {

        StringBuilder st = new StringBuilder(str);  // object

        st.reverse();
        String reversedStr = st.toString(); // compare reason

        if (str.equals(reversedStr)) {

            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is Not palindrome");
        }
    }


    public static void main(String[] args) {

        Task3 task3 = new Task3();

        //task3.isPalindrome(   "Kaya"); String result=task3.isPalidrome ("Kaya"); cant assign void methods to variabels

        //System.out.println(task3.isPalindrome("kaya")); // can`t use void in println

        task3.isPalindrome(   "kaya");


    }

}
