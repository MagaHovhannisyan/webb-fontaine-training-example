package class3FunctionsAndObjects.HomeworkFrom1To7;

public class NumericOperations {
    //Sum of Arguments - Overloading
    int getSumOfArguments(int a, int b, int c) { //different number of parameters
        int sum = a + b + c;
        return sum;
    }

    int getSumOfArguments(int a, int b) {
        int sum = a + b;
        return sum;
    }

    float getSumOfArguments(int a, float b) { //different type of parameters
        float sum = a + b;
        return sum;
    }

    //Sum of Arguments - Varargs
    int getSumOfArguments(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    //Recursion for Fibonacci number
    int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    //Recursion for finding product of numbers from 1 to N
    int productOfNumbersFromOneToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * productOfNumbersFromOneToN(n - 1);
    }
}
