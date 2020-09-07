package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework5Calculator {
    /*
    Write a calculator that will suggest entering 2 numbers and 1 math operation
     */
    public static void main(String[] args) {
        //Initialize known values
        int result = 0; //QUESTION: Would like to know the logic when I need to initialize the variable when not
        int firstNumber;
        int secondNumber;
        char mathOperation = '*';

        //Get unknown values and result
        System.out.println("Please enter your first number");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
            System.out.println("Please enter your second number");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                System.out.println("Please enter the math operation");
                mathOperation = scanner.next().charAt(0);
                scanner.close();
                scanner.close();
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
                        result = firstNumber / secondNumber;
                        break;
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