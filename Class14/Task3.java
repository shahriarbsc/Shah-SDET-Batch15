package Class14;

public class Task3 {
    public static void main(String[] args) {

//       3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”

//       How would you find out how many sentences are in that String?

String str="Is it Saturday? Is it raining? Do we have a Java Class Today?";


String [] arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println(str.split("[?]").length);

    }
}
