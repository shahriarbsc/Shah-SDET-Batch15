package Class13;
public class Class13HW1Shah {

    public static void main(String[] args) {

        //        1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str="  Batch 15 is not great";

        String newStr=str.replaceAll(" ", "");

        System.out.println(newStr);



    }
}
