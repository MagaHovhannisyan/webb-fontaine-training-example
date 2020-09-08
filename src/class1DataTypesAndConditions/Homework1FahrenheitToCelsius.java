package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework1FahrenheitToCelsius {
    /*
     Write a program to convert temperature from Fahrenheit to Celsius degree.
     */
    public static void main(String[] args) {
        //Initialize known values
        float fahrenheit;

        //Get unknown values
        System.out.println("Please enter today's temperature in Fahrenheit");
        Scanner scanner = new Scanner(System.in);

        //Get logic and output
        if (scanner.hasNextFloat()) {
            fahrenheit = scanner.nextFloat();
            scanner.close();
            float celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Today's temperature is " + celsius + " in Celsius");
        } else {
            //Get error message when entering with wrong format
            System.out.println("You should have entered only number");
        }
    }
}