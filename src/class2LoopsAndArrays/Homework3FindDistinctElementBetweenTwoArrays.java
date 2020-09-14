package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3FindDistinctElementBetweenTwoArrays {
    /*
    Given 2 arrays, find an element in the first array that does not occur in the second array.
     */
    public static void main(String[] args) {
        //1. Ask the length of the First Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of First Array");
        //Error message when entering non integer value as First array length
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value as First Array length");
            scanner.next();
        }
        int arrayLength1 = scanner.nextInt();
        //Error message when entering negative numeric value or zero as First array length
        while (arrayLength1 <= 0) {
            System.out.println("Please enter only positive integer value as First Array length");
            //Error message when entering non integer value as First array length
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value as First Array length");
                scanner.next();
            }
            arrayLength1 = scanner.nextInt();
        }
        //2. Create First Array
        int[] array1 = new int[arrayLength1];
        //3. Input elements of First array
        for (int i = 0; i < arrayLength1; i++) {
            System.out.println("Enter First array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of First array element can be only double");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }
        //Printout First Array
        System.out.println("Here is the First Array: " + Arrays.toString(array1));

        //4. Input length of Second Array
        System.out.println("Please enter the length of Second Array");
        //Error message when entering non integer value as Second Array length
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value as Second Array length");
            scanner.next();
        }
        int arrayLength2 = scanner.nextInt();
        //Error message when entering negative numeric value or zero as Second array length
        while (arrayLength2 <= 0) {
            System.out.println("Please enter only positive integer value as Second Array length");
            //Error message when entering non integer value as Second array length
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value as Second Array length");
                scanner.next();
            }
            arrayLength2 = scanner.nextInt();
        }
        //5. Create Second Array
        int[] array2 = new int[arrayLength2];
        //6. Input elements of Second array
        for (int i = 0; i < arrayLength2; i++) {
            System.out.println("Enter Second array element No " + (i + 1));
            //Error message when user enters invalid value as Second array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of Second array element can be only double");
                scanner.next();
            }
            array2[i] = scanner.nextInt();
        }
        //Printout Second Array
        System.out.println("Here is the Second Array: " + Arrays.toString(array2));

        //7. Find the logic
        for (int i = 0; i < array1.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
                if (counter > 0) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("The Element with index " + i + " and value " + array1[i] +
                        " of the First Array does not occur in the Second Array");
                break;
            }
        }
    }
}