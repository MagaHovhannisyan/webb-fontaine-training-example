package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1ReversedArray {
    /*
    Given an array of integers, create another array that have elements of the first array in reversed order.
     */
    public static void main(String[] args) {
        //1. Ask the length of Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of Array");
        //Error message when entering non integer value as array length
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value");
            scanner.next();
        }
        int arrayLength = scanner.nextInt();
        //Error message when entering negative numeric value or zero as array length
        while (arrayLength <= 0) {
            System.out.println("Please enter only positive integer value");
            //Error message when entering non integer value as array length
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        }
        //2. Create array with random values
        int[] originalArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            originalArray[i] = (int) (Math.random() * 100);
        }
        //Printout the Original Array
        System.out.println("The Original Array: " + Arrays.toString(originalArray));
        //3. Reverse created Original Array
        for (int i = 0; i < originalArray.length; i++) {
            int[] reversedArray = new int[arrayLength];
            for (int a = reversedArray.length - 1; a >= 0; a--) {
                reversedArray[a] = originalArray[i];
                i = i + 1;
            }
            //Printout the Reversed Array
            System.out.println("The Reversed Array: " + Arrays.toString(reversedArray));
        }
    }
}