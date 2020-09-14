package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6TwoDimensionalArrayIntoOne {
    /*
    Represent the given two-dimensional array in the same sequence of a one-dimensional array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Input the number of rows of two-dimensional array
        System.out.println("Please enter the number of Rows");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter positive integer number");
            scanner.next();
        }
        int row = scanner.nextInt();
        while (row <= 0) {
            //Error message when entering negative integer input as row
            System.out.println("Please enter only positive integer input as number of rows");
            while (!scanner.hasNextInt()) {
                //Error message when entering non integer input as row
                System.out.println("Please enter only integer input as number of rows");
                scanner.next();
            }
            row = scanner.nextInt();
        }

        //2. Input the number of columns of two-dimensional array
        System.out.println("Please enter the number of Columns");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter positive integer number");
            scanner.next();
        }
        int column = scanner.nextInt();
        while (column <= 0) {
            //Error message when entering negative integer input as column
            System.out.println("Please enter only positive integer input as number of columns");
            while (!scanner.hasNextInt()) {
                //Error message when entering non integer input as column
                System.out.println("Please enter only integer input as number of columns");
                scanner.next();
            }
            column = scanner.nextInt();
        }

        //Declaring two-dimensional array
        int twoDim[][] = new int[row][column];

        //3. Generate elements of two-dimensional array randomly
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = (int) (Math.random() * 100);
                System.out.println("twoDim[" + i + "]" + "[" + j + "]" + " = " + twoDim[i][j]);
            }
        }
        //Printout created two-dimensional array
        System.out.println("Two-dimensional array " + Arrays.deepToString(twoDim));

        //4. Collect the elements of two-dimensional array into one-dimensional
        int totalLength = twoDim.length * twoDim[1].length;
        int[] myArray = new int[totalLength];
        int a = 0;
        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                myArray[a] = twoDim[i][j];
                a++;
            }
        }
        //Printout created one-dimensional array
        System.out.println("One-dimensional array " + Arrays.toString(myArray));
    }
}