package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework7AscAndDesc {
    /*
    Write a program that will sort the given mass in ascending and descending order.
    Use Math.random() method for initializing array elements.
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
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        //Printout created Original array
        System.out.println("The Original Array: " + Arrays.toString(arr));

        //3. Sort the array in descending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}