package Class16;
public class Class16HW1Shah {

    //1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.


//return type= int
//nameof the method=sumArrayElements
// parameter= int [] arr
    // access modifier = default

    int sumArrayElements(int[] array) {
        int sum = 0;

        for (int num: array) {

            sum += sum;

        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 35, 45};
        Class16HW1Shah shah1 = new Class16HW1Shah();

        System.out.println(shah1.sumArrayElements(arr));


    }
}
