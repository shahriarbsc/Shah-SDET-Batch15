package Class14;

public class ArraysAddMachine {
    public static void main(String[] args) {
        int[] array2 = {10, 10, 10, 20, 30};
        addArraysElementsMachine(array2);

        int[] array3 = {20, 20, 40, 40};
        addArraysElementsMachine(array3);


    }

    static void addArraysElementsMachine(int[] arr) {

        int sum = 0;

        for (int number : arr) {

            sum += number;

        }
        System.out.println(sum);
    }


}
