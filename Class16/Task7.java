package Class16;
public class Task7 {

    //HW Work class 16 task1
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
        Task7 task7=new Task7();

        System.out.println(task7.sumArrayElements(arr));

    }

}
