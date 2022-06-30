package ru.stqa.pft.sandbox;

public class MyFirstClass {
    public static void main(String[] args) {

        Point p1 = new Point(5, 4);
        Point p2 = new Point(3, 23);

        System.out.println(distance(p1, p2));
        System.out.println(p1.distance(p2));
    }

    public static double distance(Point p1, Point p2) {
        double squarePointFirst =Math.pow((p1.point1 - p2.point1), 2);
        double squarePointsSecond =Math.pow((p1.point2 - p2.point2), 2);
        return Math.sqrt(squarePointFirst + squarePointsSecond);
    }
}