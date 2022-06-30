package ru.stqa.pft.sandbox;

public class Point {
    public double point1;
    public double point2;

    public Point(double point1, double point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double distance(Point p2) {
        double squarePointFirst =Math.pow((this.point1 - p2.point1), 2);
        double squarePointsSecond =Math.pow((this.point2 - p2.point2), 2);
        return Math.sqrt(squarePointFirst + squarePointsSecond);
    }

}
