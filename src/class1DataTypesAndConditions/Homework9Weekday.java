package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework9Weekday {
    /*
    Write a Java program that keeps a number from the user
    and generates an integer between 1 and 7 and displays the name of the weekday.
     */

    public static void main(String[] args) {
        //Initialize known values
        int number;
        String weekday;

        //Get unknown values and output
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            scanner.close();
            switch (number) {
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
                case 7:
                    weekday = "Sunday";
                    break;
                default:
                    weekday = "Please enter a number between 1-7 range";
            }
            System.out.println(weekday);
        } else {
            System.out.println("Your input should be only number");
        }
    }
}