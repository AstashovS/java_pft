package ru.stqa.pft.sandbox;

public class MyFirstClass {
    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(7, 2);

        System.out.println(distance(p1, p2));
        System.out.println(p1.distance(p2));
    }

    public static double distance(Point p1, Point p2) {
        double squarePointFirst =Math.pow((p1.coordinate1 - p2.coordinate1), 2);
        double squarePointsSecond =Math.pow((p1.coordinate2 - p2.coordinate2), 2);
        return Math.sqrt(squarePointFirst + squarePointsSecond);
    }
}