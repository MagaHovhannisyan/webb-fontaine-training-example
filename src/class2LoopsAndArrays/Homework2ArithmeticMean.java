package class2LoopsAndArrays;

import java.util.Scanner;

public class Homework2ArithmeticMean {
    /*
    Write a program that will calculate the arithmetic mean of array elements
     */
    public static void main(String[] args) {
        //Initialize known values
        int arrayLength = 10;
        double sum = 0;
        double[] myArray = new double[arrayLength];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayLength; i++) {
            //1. Input array elements
            System.out.println("Enter array element No " + (i + 1));
            //Error message when user enters invalid value as array element
            while (!scanner.hasNextDouble()) {
                System.out.println("The type of array element can be only double");
                scanner.next();
            }
            myArray[i] = scanner.nextDouble();
            //2. Calculate sum of array element values
            sum = sum + myArray[i];
        }
        //3. Calculate mean
        double mean = sum / arrayLength;
        //Printout the result
        System.out.println("The arithmetic mean of array is equal to " + mean);
    }
}