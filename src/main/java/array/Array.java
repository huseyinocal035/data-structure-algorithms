package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private void getAverageTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days temperatures? ");
        int numberOfDays = scanner.nextInt();
        int[] temperatures = new int[numberOfDays];
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temperature: ");
            int temperature = scanner.nextInt();
            temperatures[i] = temperature;
            sum += temperature;
        }
        double average = sum / numberOfDays;
        System.out.println("Average = " + average);

        int aboveDaysFromAverage = 0;
        for (int i : temperatures) {
            if (i > average) aboveDaysFromAverage++;
        }
        System.out.println(aboveDaysFromAverage + " day(s) above average");
    }

    private void getMissingNumber(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int missingNumber = expectedSum - sum;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Missing number: " + missingNumber);
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i],nums[j]};
                }
            }
        }
        return new int[0];
    }

    private int searchInArray(int[] array, int valueToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) return i;
        }
        return -1;
    }

    private String maxProduct(int[] array) {
        int highestValue = 0;
        int secondHighestValue = 0;
        for (int j : array) {
            if (j > highestValue) {
                secondHighestValue = highestValue;
                highestValue = j;
            }
            if (j > secondHighestValue && j < highestValue) secondHighestValue = j;
        }
        return "Max Product of the array is " + highestValue * secondHighestValue;
    }

    private boolean isUnique(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) return false;
            }
        }
        return true;
    }

    public boolean permutation(int[] array1, int[] array2){
        if (array1.length != array2.length) return false;

        int sumOfArrayOne = 0;
        int sumOfArrayTwo = 0;
        int productOfArrayOne = 1;
        int productOfArrayTwo = 1;

        for (int i = 0; i < array1.length; i++) {
            sumOfArrayOne += array1[i];
            sumOfArrayTwo += array2[i];
            productOfArrayOne *= array1[i];
            productOfArrayTwo *= array2[i];
        }

        return sumOfArrayOne == sumOfArrayTwo || productOfArrayOne == productOfArrayTwo;
    }

    private boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
