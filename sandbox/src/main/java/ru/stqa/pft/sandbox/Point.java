package ru.stqa.pft.sandbox;

public class Point {
    public double coordinate1;
    public double coordinate2;

    public Point(double coordinate1, double coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    public double distance(Point p2) {
        double squarePointFirst =Math.pow((this.coordinate1 - p2.coordinate1), 2);
        double squarePointsSecond =Math.pow((this.coordinate2 - p2.coordinate2), 2);
        return Math.sqrt(squarePointFirst + squarePointsSecond);
    }

}
