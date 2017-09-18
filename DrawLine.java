// Thomas Huber 9/18/17

import java.util.Scanner;

public class DrawLine {
    public static void main(String []args) {
        System.out.println("Enter the four points that will determine your line one by one\nin the form x1, y1, x2, y2"); 
        System.out.println(getEquation(getCoordinate(), getCoordinate(), getCoordinate(), getCoordinate()));
    }

    public static double getCoordinate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your point: ");
        double point = sc.nextDouble();
        return point;
    }

    public static String getEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2-y1)/(x2-x1);
        double b = y1 - (slope*x1);
        return "y = " + slope + "x + " + b;
    }
}