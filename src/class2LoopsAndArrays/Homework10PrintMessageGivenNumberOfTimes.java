package class2LoopsAndArrays;

import java.util.Scanner;

public class Homework10PrintMessageGivenNumberOfTimes {
    /*
    Input a number and the program will print a message a given number of times.
    The process should continue until the user inputs the number '-1'.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many messages should I print?");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter only integer input as print number");
            scanner.next();
        }        int printNumber = scanner.nextInt();
        while (printNumber != -1) {
            for (int i = 0; i < printNumber; ++i) {
                System.out.println("Printed message No " + (i + 1));
            }
            System.out.println("How many messages should I print?");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer input as print number");
                scanner.next();
            }            printNumber = scanner.nextInt();
            if (printNumber == -1) {
                System.out.println("You just entered -1. Bye!");
            }
        }
    }
}