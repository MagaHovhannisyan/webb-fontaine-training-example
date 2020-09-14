package class2LoopsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework8FindRepeatingElementBetweenTwoArrays {
    /*
    Write a program that will find and separate the repeating values of two given arrays.
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
        int[] arr1 = new int[arrayLength1];
        //3. Input elements of First array
        for (int i = 0; i < arrayLength1; i++) {
            System.out.println("Enter First array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of First array element can be only double");
                scanner.next();
            }
            arr1[i] = scanner.nextInt();
        }
        //Printout First Array
        System.out.println("Here is the First Array: " + Arrays.toString(arr1));

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
        int[] arr2 = new int[arrayLength2];
        //6. Input elements of Second array
        for (int i = 0; i < arrayLength2; i++) {
            System.out.println("Enter Second array element No " + (i + 1));
            //Error message when user enters invalid value as Second array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of Second array element can be only double");
                scanner.next();
            }
            arr2[i] = scanner.nextInt();
        }
        //Printout Second Array
        System.out.println("Here is the Second Array: " + Arrays.toString(arr2));


        //Collect repeating values in an ArrayList
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //If the value repeats for the first time, add to the list
                if (!arr3.contains(arr1[i]) && arr1[i] == arr2[j]) {
                    arr3.add(arr1[i]);
                }
            }
        }
        //Message when there is no repeated value
        if (arr3.isEmpty()) {
            System.out.println("There is no repeating value in two given arrays");
        }
        //Printout collected values of ArrayList
        else {
            System.out.println("Following values are repeated in given two arrays: " + arr3);
        }
    }
}