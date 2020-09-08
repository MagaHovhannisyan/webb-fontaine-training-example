package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework10OddEven {
    /*
    Write a program which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
    The program shall always print “bye!” before exiting.
     */

    public static void main(String[] args) {
        //Initialize known values
        int number;
        String message;

        //Get unknown values and output
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            //COMMENT: is written with assumption that zero is even number as well
            if (number % 2 == 0) {
                message = "Even Number";
            } else {
                message = "Odd Number";
            }
            System.out.println(message);
            System.out.println("Bye");
        } else {
            System.out.println("Your input should be only number");
        }
    }
}