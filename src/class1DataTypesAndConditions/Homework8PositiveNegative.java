package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework8PositiveNegative {
    /*
   Write a program that reads a floating-point number and prints "zero" if the number is zero.
   Otherwise, print "positive" or "negative".
   Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
   */
    public static void main(String[] args) {
        //Initialize known values
        float number;
        String statement;

        //Get unknown values and result
        System.out.println("Please enter your number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextFloat()) {
            number = scanner.nextFloat();
            scanner.close();
            if (number == 0) {
                statement = "zero";
            } else if (number > 0) {
                if (number < 1) {
                    statement = "positive small";
                } else if (number > 1000000) {
                    statement = "positive large";
                } else {
                    statement = "positive";
                }
            } else {
                if (number > -1) {
                    statement = "negative small";
                } else if (number < -1000000) {
                    statement = "negative large";
                } else {
                    statement = "negative";
                }
            }
            System.out.println(statement);
        } else {
            System.out.println("The input should be only number");
        }
    }
}