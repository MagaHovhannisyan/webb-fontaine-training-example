package class1DataTypesAndConditions;

import java.util.Scanner;

public class Homework6CityCoordinates {
    /*
    Write a program that will suggest you to enter the coordinates of 2 cities and will calculate:
    a) The distance between 2 cities
    b) The middle point between 2 cities
     */
    public static void main(String[] args) {
        //Initialize known values
        int latitude1;
        int longitude1;
        int latitude2;
        int longitude2;
        int latitude3;
        int longitude3;
        int destination;
        String errorMessage = "The input should be only number";

        //Get unknown values and result
        System.out.println("Please enter latitude of 1st destination");
        Scanner lat1 = new Scanner(System.in);
        if (lat1.hasNextInt()) {
            latitude1 = lat1.nextInt();
            System.out.println("Please enter longitude of 1st destination");
            Scanner long1 = new Scanner(System.in);
            if (long1.hasNextInt()) {
                longitude1 = long1.nextInt();
                System.out.println("Please enter latitude of 2nd destination");
                Scanner lat2 = new Scanner(System.in);
                if (lat2.hasNextInt()) {
                    latitude2 = lat2.nextInt();
                    System.out.println("Please enter longitude of 2nd destination");
                    Scanner long2 = new Scanner(System.in);
                    if (long2.hasNextInt()) {
                        longitude2 = long2.nextInt();
                        //Calculate and get destination
                        int d1 = (int) Math.pow((latitude1 - latitude2), 2);
                        int d2 = (int) Math.pow((longitude1 - longitude2), 2);
                        destination = (int) Math.sqrt(d1 + d2);
                        System.out.println("The distance between two cities is " + destination);
                        //Calculate and get middle point
                        latitude3 = (latitude1 + latitude2) / 2;
                        longitude3 = (longitude1 + longitude2) / 2;
                        System.out.println("The middle point between two cities is " + "(" + latitude3 + ";" + longitude3 + ")");
                    } else {
                        System.out.println(errorMessage);
                    }
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println(errorMessage);
            }
        } else {
            System.out.println(errorMessage);
        }
    }
}