package class1DataTypesAndConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework2InchesToMeters {
    /*
    Write a program that reads a number in inches, converts it to meters.
     */
    public static void main(String[] args) {
        //Initialize known values
        float inch;
        float meter;

        //Set meter printout format
        DecimalFormat meterFormat = new DecimalFormat("0.00");

        //Get unknown values
        System.out.println("Please enter the number in inches");
        Scanner scanner = new Scanner(System.in);

        //Get logic and output
        if (scanner.hasNextFloat()) {
            inch = scanner.nextFloat();
            scanner.close();
            if (inch < 0) {
                System.out.println("You should have entered positive number");
            } else {
                meter = Float.parseFloat(meterFormat.format((inch / 39.37f)));
                System.out.println(inch + " inches is equal to " + meter + " meters");
            }
        } else {
            //Get error message when entering with wrong format
            System.out.println("The entry should be only numeric");
        }
    }
}