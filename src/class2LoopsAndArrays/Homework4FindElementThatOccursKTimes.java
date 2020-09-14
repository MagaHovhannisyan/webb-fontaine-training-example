package class2LoopsAndArrays;

import java.util.Scanner;

public class Homework4FindElementThatOccursKTimes {
    /*
    Given an array of integers and one integer k, find an element that occurs exactly k times.
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
        int arrayLength = scanner.nextInt();
        //Error message when entering negative numeric value or zero as array length
        while (arrayLength <= 0) {
            System.out.println("Please enter only positive integer value as Array length");
            //Error message when entering non integer value as array length
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value as Array length");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        }
        //2. Create Array
        int[] array = new int[arrayLength];
        //3. Input elements of array
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of array element can be only double");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        //Printout created Array
        System.out.println("You just have created following Array : ");
        for (int element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
        //3. Input k
        System.out.println("Please enter the number of occurrence you are searching");
        while (!scanner.hasNextInt()) {
            //Error message when entering non integer input as K
            System.out.println("Please enter only integer input as number of element occurrence");
            scanner.next();
        }
        int k = scanner.nextInt();
        while (k <= 0) {
            //Error message when entering negative integer input as K
            System.out.println("Please enter only positive integer input as number of element occurrence");
            while (!scanner.hasNextInt()) {
                //Error message when entering non integer input as K
                System.out.println("Please enter only integer input as number of element occurrence");
                scanner.next();
            }
            k = scanner.nextInt();
        }
        //5. Find the element that occurs exactly k times
        for (int i = 0; i < array.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter > k) {
                    break;
                }
            }
            if (counter == k) {
                System.out.println("The Element " + array[i] + " occurs exactly " + k + " times");
                break;
            }
        }
    }
}