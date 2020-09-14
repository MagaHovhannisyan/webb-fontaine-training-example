package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9DeleteArrayElement {
    /*
    Write a program that will delete the array element of the given index.
     */
    public static void main(String[] args) {
        //1. Ask the length of the Array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of Array");
        //Error message when entering non integer value as array length
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value as Array length");
            scanner.next();
        }
        int arrayLength1 = scanner.nextInt();
        //Error message when entering negative numeric value or zero as array length
        while (arrayLength1 <= 0) {
            System.out.println("Please enter only positive integer value as Array length");
            //Error message when entering non integer value as array length
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value as Array length");
                scanner.next();
            }
            arrayLength1 = scanner.nextInt();
        }
        //2. Create Array
        int[] array = new int[arrayLength1];
        //3. Input elements of array
        for (int i = 0; i < arrayLength1; i++) {
            System.out.println("Enter array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of array element can be only double");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        //Printout Array
        System.out.println("Here is the created Array: " + Arrays.toString(array));

        //4. Find the index of element to delete
        System.out.println("Please enter the index of element you want to delete");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            if ((index >= 0) && index < (array.length)) {
                int[] newArray = new int[array.length - 1];
                for (int i = 0, k = 0; i < array.length; i++) {
                    // if the index is the removal element index
                    if (i == index) {
                        continue;
                    }
                    // if the index is not the removal element index
                    else {
                        newArray[k++] = array[i];
                    }
                }
                //Print new array without deleted element
                System.out.println("Here is the New array: " + Arrays.toString(newArray));
            }
        }
    }
}