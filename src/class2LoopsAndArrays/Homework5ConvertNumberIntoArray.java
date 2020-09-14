package class2LoopsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5ConvertNumberIntoArray {
    /*
    Write a program that will convert the entered number into an array.
     */
    public static void main(String[] args) {
        //1. Get unknown number
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Number you want to convert into an Array");
        //Error message when entering non integer value
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer value");
            scanner.next();
        }
        int num = scanner.nextInt();
        while (num <= 0) {
            System.out.println("Please enter only positive integer value");
            //Error message when entering non integer value
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value");
                scanner.next();
            }
            num = scanner.nextInt();
        }

        //2. Convert numeric type of value to String type
        String str = Integer.toString(num);
        //Create array of char type
        char[] ch = new char[str.length()];
        //3. Fill-in elements of char array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.println("array[" + i + "]" + " = " + ch[i]);
        }
    }
}