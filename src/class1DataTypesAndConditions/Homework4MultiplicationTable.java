package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework4MultiplicationTable {
    /*
    Write a program that will prompt you to enter a natural number
    and print the multiplication table corresponding to the number on the screen.
     */
    public static void main(String[] args) {
        //Initialize known values
        int myNumber;

        //Get unknown values and result
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            myNumber = scanner.nextInt();
            scanner.close();
            if (myNumber < 0) {
                System.out.println("Please enter only natural number");
            } else {
                for (int a = 0; a <= 9; a++) {
                    System.out.println(myNumber + " X " + a + " = " + myNumber * a);
                }
            }
        } else {
            System.out.println("I am sorry, but I can multiply only numbers");
        }
    }
}