package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeComplexity {

    public static void printSumAndProductOfArray(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i : array) {
            sum += i;
            product *= i;
        }
        System.out.println("Sum : " +sum + "\nProduct : " +product);
    }

    public static void getPairFromArray(int[] array) {
        List<String> pairs = new ArrayList<>();
        for (int j : array) {
            for (int k : array) {
                pairs.add(j + ", " + k);
            }
        }
        pairs.forEach(System.out::println);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i<array.length/2; i++) {
            int other = array.length-i-1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }

        System.out.println(Arrays.toString(array));
    }


}
