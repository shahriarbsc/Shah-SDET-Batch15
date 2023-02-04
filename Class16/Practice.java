package Class16;

import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {

        int[][] numbers = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        int[] rowSums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                rowSum += numbers[i][j];
            }
            rowSums[i] = rowSum;
        }
        System.out.println(Arrays.toString(rowSums));
    }
}











