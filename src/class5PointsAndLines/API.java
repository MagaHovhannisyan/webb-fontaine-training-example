package class5PointsAndLines;

public class API {
    private static double middleA;
    private static double middleB;

    public static Point middlePoint(Point a, Point b) {
        if (a == null || b == null || a.equals(b)) {
            System.out.println("Cannot make calculations with the same point");
            return null;
        }
        middleA = (a.getX() + b.getX()) / 2;
        middleB = (a.getY() + b.getY()) / 2;
        Point middlePoint = new Point(middleA, middleB);
        System.out.println("middlePoint = " + middlePoint);
        return middlePoint;
    }

    public static void summingUp(Point a, Point b, Point c) {
        Line newLineAC = new Line(a, c);
        Line newLineCB = new Line(c, b);
        Line newLineAB = new Line(a, b);
        if (a == null || !(a instanceof Point) ||
                b == null || !(b instanceof Point) ||
                c == null || !(c instanceof Point)) {
            System.out.println("Please enter valid values");
            return;
        } else if (newLineAB.getLength() == newLineAC.getLength() + newLineCB.getLength()) {
            System.out.println("Yes, point C belongs to the Line AB");
        } else {
            System.out.println("No, point C does not belong to the Line AB");
        }
    }

    public static boolean checkSquare(Point a, Point b, Point c, Point d) {
        Line newLineAB = new Line(a, b);
        Line newLineBC = new Line(b, c);
        Line newLineCD = new Line(c, d);
        Line newLineDA = new Line(d, a);
        Line newLineAC = new Line(a, c);
        Line newLineBD = new Line(b, d);
        if (a == null || !(a instanceof Point) ||
                b == null || !(b instanceof Point) ||
                c == null || !(c instanceof Point) ||
                d == null || !(d instanceof Point)) {
            System.out.println("Please enter valid values");
            return false;
        } else if (newLineAB.equalLines(newLineBC) &&
                newLineBC.equalLines(newLineCD) &&
                newLineCD.equalLines(newLineDA) &&
                newLineAC.equalLines(newLineBD)) {
            System.out.println("Yes, you can draw a square with given points");
            return true;
        } else {
            System.out.println("No, you cannot draw a square with given points");
            return false;
        }
    }

    public static void checkPointSquare(Point a, Point b, Point c, Point d, Point e) {
        if (checkSquare(a, b, c, d) == true) {
            if (a.getX() < e.getX() && e.getX() < b.getX() &&
                    a.getY() < e.getY() && e.getX() < d.getY()) {
                System.out.println("Yes, the Point belong to the Square");
            } else {
                System.out.println("I'm sorry, but the Point does not belong to the Square");
            }
        } else System.out.println("Sorry, you should try again");
    }
}