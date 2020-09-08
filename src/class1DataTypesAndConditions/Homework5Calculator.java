package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework5Calculator {
    /*
    Write a calculator that will suggest entering 2 numbers and 1 math operation
     */
    public static void main(String[] args) {
        //Initialize known values
        int firstNumber;
        int secondNumber;

        //Get unknown values and result
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
            System.out.println("Please enter your second number");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                System.out.println("Please enter the math operation");
                char mathOperation = scanner.next().charAt(0);
                scanner.close();
                int result;
                switch (mathOperation) {
                    case '+':
                        result = firstNumber + secondNumber;
                        break;
                    case '-':
                        result = firstNumber - secondNumber;
                        break;
                    case '*':
                        result = firstNumber * secondNumber;
                        break;
                    case '/':
                        if (secondNumber == 0) {
                            System.out.println("You cannot divide number by zero");
                            return;
                        } else {
                            result = firstNumber / secondNumber;
                            break;
                        }
                    default:
                        System.out.println("Please enter one of following math operations : + - * /");
                        return;
                }
                System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = " + result);
            } else {
                System.out.println("Second input should be only numeric");
            }
        } else {
            System.out.println("First input should be only numeric");
        }
    }
}