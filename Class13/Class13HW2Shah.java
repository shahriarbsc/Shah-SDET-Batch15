package Class13;
public class Class13HW2Shah {

    public static void main(String[] args) {

        //        2) Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str="jnfjdnJNJFD87687&*(()";

        System.out.println(str.replace("[^A-ZAa-z0-9]", " ").length());

        System.out.println(str);

    }
}
