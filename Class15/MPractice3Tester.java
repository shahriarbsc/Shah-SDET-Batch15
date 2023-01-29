package Class15;

public class MPractice3Tester {

    public static void main(String[] args) {
        //Create a method that takes an array of int sum all the elements from the array
        // and return the sum.

        //1. Create the object of the class that has the method
        // objectname.methodname



        MPractice3 mp = new MPractice3();
        int[] array = {10, 20, 30};


        System.out.println(mp.arraySum(array));
        System.out.println(mp.arraySum(new int[]{10,10,10}));

    }

}
























