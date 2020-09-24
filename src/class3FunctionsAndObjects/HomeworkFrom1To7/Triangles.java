package class3FunctionsAndObjects.HomeworkFrom1To7;

import java.util.Scanner;

public class Triangles {
    //Create Triangle - creates Array having 3 elements as Triangle sides
    double[] createTriangle() {
        Scanner scanner = new Scanner(System.in);
        double[] triangle = new double[3];
        for (int i = 0; i < 3; ++i) {
            System.out.println("Please enter value for side " + (i + 1) + " of triangle");
            //Error message when entering non double value
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter only double value");
                scanner.next();
            }
            double side = scanner.nextDouble();
            //Error message when entering negative numeric value or zero as triangle side value
            while (side <= 0) {
                System.out.println("Please enter only positive integer value");
                //Error message when entering non integer value as triangle side value
                while (!scanner.hasNextDouble()) {
                    System.out.println("Please enter only integer value");
                    scanner.next();
                }
                side = scanner.nextDouble();
            }
            triangle[i] = side;
        }
        return triangle;
    }

    //Calculate Triangle area by checking side validation
    double calculateArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    //Check whether provided triangle is valid
    boolean checkTriangleLogic(double[] triangle) {
        if (triangle[0] + triangle[1] <= triangle[2] ||
                triangle[0] + triangle[2] <= triangle[1] ||
                triangle[1] + triangle[2] <= triangle[0]) {
            return false;
        }
        return true;
    }

    // Calculate Area of provided triangle - Array
    double calculateArea(double[] triangle, boolean checkTriangleLogic) {
        if (checkTriangleLogic == false) {
            System.out.println("Can not create triangle with provided sides");
        }
        double p = 0;
        for (int i = 0; i < 3; ++i) {
            p = p + triangle[i];
        }
        p = p / 2;
        double area = Math.sqrt(p * (p - triangle[0]) * (p - triangle[1]) * (p - triangle[2]));
        return area;
    }
}
