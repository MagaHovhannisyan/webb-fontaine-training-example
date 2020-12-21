package class5PointsAndLines;

public class PointLineDemo {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(8, 6);
        Point pointA = new Point(10, 10);
        Point pointB = new Point(20, 10);
        Point pointC = new Point(20, 20);
        Point pointD = new Point(10, 20);
        Point pointE = new Point(11, 11);

        /*
         * 1. Calculate the distance between two points.
         */
        System.out.println("1. Here is the distance between the two points : ");
        Line line = new Line(point1, point2);
        Line.getLength();

        /*
         * 2. Calculate the middle point between of two points.
         */
        System.out.println("2. Here is the middle point between the two points : ");
        API.middlePoint(point1, point2);

        /*
         * 3. Find out if given point belongs to the square.
         */
        System.out.println("3. Hey, does my Point belong to the Square? : ");
        API.checkPointSquare(pointA, pointB, pointC, pointD, pointE);

        /*
        * 4. Find out if the given Point is on the Line.
         */
        System.out.println("4. Does point C belong to the Line? : ");
        API.summingUp(pointA, pointB, pointC);

        /*
        * 5. Find out if a square can be drawn with given 4 points.
         */
        System.out.println("5. Can I draw a square? : ");
        API.checkSquare(pointA, pointB, pointC, pointD);
    }
}