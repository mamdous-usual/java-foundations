package in.knowledgegate;

import in.gettersetter.Car;

public class TestGetter {
    public static void main(String[] args) {
        Car car = new Car("White", "Honda", 5, 340000);
        System.out.println(car);
        car.setColor("Blue");
        car.setColor("Yellow");
        System.out.printf("%s %s",car.getColor(), car.getModel());
    }
}
