package class3FunctionsAndObjects.HomeworkFrom1To7;

import java.util.Scanner;
//Utility Class, also known as Helper class, is a class, which contains just static methods.
public class Arrays {
    //Get Array Length - output - positive integer number
    static int getArrayLength() {
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
        return arrayLength;
    }

    //Create Random one-dimensional Array - output - array with provided length and random element values
    static int[] createRandomArray(int arrayLength) {
        //1. Create  Array
        int[] array = new int[arrayLength];
        //2. Input random element values
        for (int i = 0; i < arrayLength; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    //Create one-dimensional Array - output - array with provided length and provided element values
    static int[] createArray(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        //1. Create  Array
        int[] array = new int[arrayLength];
        //2. Input elements of Array
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter Array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextInt()) {
                System.out.println("The type of Array element can be only integer");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Create one Array by combining the elements of provided two Arrays
    static int[] combineTwoArrays(int[] firstArray, int[] secondArray) {
        //Define the length of combined Array
        int totalLength = firstArray.length + secondArray.length;
        //Create new Array
        int[] combinedArray = new int[totalLength];
        //Input elements of First Array
        for (int i = 0, a = 0; i < firstArray.length; ++i, ++a) {
            combinedArray[a] = firstArray[i];
        }
        //Input elements of Second Array
        for (int j = secondArray.length - 1, a = totalLength - 1; j >= 0; --j, --a) {
            combinedArray[a] = secondArray[j];
        }
        return combinedArray;
    }

    //Create Array with doubled elements - gets an Array and doubles its elements
    static int[] getDoubledArray(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            doubledArray[i] = array[i] * 2;
        }
        return doubledArray;
    }

    //Print Array element - output - print of elements of provided one-dimensional Array
    static void arrayElementPrintout(int[] array, String message) {
        System.out.println("Please find the " + message + " bellow:");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    //Calculate the mean of provided Array element values
    static double mean(int[] array, int arrayLength) {
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            //2. Calculate sum of array element values
            sum = sum + array[i];
        }
        double mean = sum / arrayLength;
        return mean;
    }

    //Get index of given Array Element
    static int findIndex(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the index of Element");
        //Error message when entering non integer value
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value");
            scanner.next();
        }
        int index = scanner.nextInt();
        //Error message when entering negative numeric value or zero
        while (index < 0 || index > array.length - 1) {
            System.out.println("Please enter only positive integer value that is within array length");
            //Error message when entering non integer value as index
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value");
                scanner.next();
            }
            index = scanner.nextInt();
        }
        return index;
    }

    //Increase the value of provided index by increase value
    static int increaseElementValue(int[] array, int index, float increaseValue) {
        array[index] = (int) (array[index] * increaseValue);
        return array[index];
    }
}