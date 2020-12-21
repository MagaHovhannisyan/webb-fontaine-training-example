package class5PointsAndLines;

import java.text.DecimalFormat;

public class Line {
    private Point a;
    private Point b;
    private double length;

    static DecimalFormat myFormat = new DecimalFormat("0.00");

    public Line(Point a, Point b) {
        if (a == null || b == null || a.equals(b)) {
            System.out.println("Cannot create line with the same point");
            return;
        }
        setA(a);
        setB(b);
        length = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
    }
    public boolean equalLines(Line line) {
        if (line == null || !(line instanceof Line)) {
            return false;
        }
        Line newLineA = line;
        Line newLineB = line;
        return newLineA.getLength() == newLineB.getLength();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double getLength() {
        System.out.println("Length " + myFormat.format(length));
        return length;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Line)) {
            return false;
        }
        Line newLine = (Line) obj;
        return a.equals(newLine.getA()) && b.equals(newLine.getB());
    }
}