package class1DataTypesAndConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework3MoonGravity {
    /*
   Write a program that by entering your weight will count your weight on the Moon.
    */
    public static void main(String[] args) {
        //Initialize known values
        float weightOnEarth;
        float weightOnMoon;

        //Set meter printout format
        DecimalFormat myFormat = new DecimalFormat("0.00");

        //Get unknown values
        System.out.println("Please enter your current weight");
        Scanner scanner = new Scanner(System.in);

        //Get logic and output
        if (scanner.hasNextFloat()) {
            weightOnEarth = scanner.nextFloat();
            scanner.close();
            if (weightOnEarth < 0) {
                System.out.println("Hey! You cannot be invisible! Your weight should be a positive number");
            } else {
                weightOnMoon = Float.parseFloat(myFormat.format(weightOnEarth * 17 / 100));
                System.out.println("If you lived on Moon, your weight would have been " + weightOnMoon);
            }
        } else {
            System.out.println("The weight can be reflected only in numbers");
        }
    }
}