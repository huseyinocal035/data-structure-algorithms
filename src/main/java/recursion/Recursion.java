package recursion;

import java.util.Arrays;

public class Recursion {

    // n! = n * (n-1)!
    private int getFactorial(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    // f(n) = f(n-1) + f(n-2)
    private int getNthFibonacciNumber(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
    }

    // f(n) = n %1 0 + f(n / 10)
    private int getSumOfDigit(int number) {
        if (number == 0 || number < 0) {
            return 0;
        }
        int remainder = number % 10;
        return remainder + getSumOfDigit(number / 10);
    }

    // number^power = number * number^power-1
    private int getPowerOfNumber(int number, int power) {
        if (power < 0) {
            return -1;
        }
        if (power == 0) {
            return 1;
        }
        return number * getPowerOfNumber(number, power - 1);
    }

    // gcd(firstNumber, 0) = firstNumber
    // gcd(firstNumber, secondNumber) = gcd(secondNumber, firstNumber mod secondNumber)
    private int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        if (firstNumber < 0 || secondNumber < 0) {
            return -1;
        }
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGreatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }

    // f(n) = n mod 2 + 10 * f(n/2)
    private int convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return 0;
        }
        return decimalNumber % 2 + 10 * convertDecimalToBinary(decimalNumber / 2);
    }

    // f(n) = A[N-1] * f(A, N-1)
    private int productOfArray(int[] array, int n) {
        if (n == 0) {
            return 1;
        }
        return array[n - 1] * productOfArray(array, n - 1);
    }

    // f(n) = n + f(n-1)
    private int recursiveRange(int num) {
        if (num == 1) {
            return 1;
        }
        return num + recursiveRange(num - 1);
    }

    private String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    private boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    private boolean containsOdd(int[] arr, OddFunction odd) {
        if (arr.length == 0) {
            return false;
        } else if (!odd.run(arr[0])) {
            return containsOdd(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }

    private char getFirstUppercaseChar(String str) {
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }
        return getFirstUppercaseChar(str.substring(1));
    }

    private String capitalizeFirstCharOfWords(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char chr = str.charAt(str.length() - 1);
        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }

        if ((str.charAt(str.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeFirstCharOfWords(str.substring(0, str.length() - 1)) + chr;
    }

}

