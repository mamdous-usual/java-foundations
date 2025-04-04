import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getRadius() {
        return 2 * Math.PI * radiusInMm;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
       return  "Circle Properties: Radius in mm: " + radiusInMm + ", Circumference in mm: "
               + getRadius() + ", Area in mm:"+ getArea() + " ";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle");
        System.out.print("Please enter the circle's radius: ");
        double radius = input.nextDouble();
        Circle newCircle = new Circle(radius);
        System.out.println(newCircle);
    }
}
