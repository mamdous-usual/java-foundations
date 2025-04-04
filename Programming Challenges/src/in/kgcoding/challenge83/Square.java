package in.kgcoding.challenge83;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
