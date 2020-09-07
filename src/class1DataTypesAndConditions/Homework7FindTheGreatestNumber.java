package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework7FindTheGreatestNumber {
  /*
     Take three numbers from the user and print the greatest number.
     */
    public static void main(String[] args) {
        //Initialize known values
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        //Get unknown values and result
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
            System.out.println("Please enter your second number");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                System.out.println("Please enter your third number");
                if (scanner.hasNextInt()) {
                    thirdNumber = scanner.nextInt();
                    scanner.close();
                    if (firstNumber > secondNumber && firstNumber > thirdNumber) {
                        System.out.println(firstNumber);
                    } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                        System.out.println(secondNumber);
                    } else {
                        System.out.println(thirdNumber);
                    }
                    //Error messages
                } else {
                    System.out.println("Third input should be only number");
                }
            } else {
                System.out.println("Second input should be only number");
            }
        } else {
            System.out.println("First input should be only number");
        }
    }
}