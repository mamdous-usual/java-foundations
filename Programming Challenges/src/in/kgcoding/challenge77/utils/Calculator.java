package in.kgcoding.challenge77.utils;

import in.kgcoding.challenge77.geometry.Circle;
import in.kgcoding.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(20, 10);

        double cirArea = Math.PI * Math.pow(circle.radius, 2);
        int rectArea = rectangle.length * rectangle.breadth;
        System.out.printf("The Area of the circle is: %f, The Area of the rectangle is: %d",cirArea, rectArea);
    }
}
