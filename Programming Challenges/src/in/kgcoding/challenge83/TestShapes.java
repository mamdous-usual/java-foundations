package in.kgcoding.challenge83;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);
        System.out.printf("Area of the circle is: %f\nArea of the square is: %f", circle.calculateArea(),
                square.calculateArea());
    }
}
