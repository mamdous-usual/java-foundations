package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Toyota";
        car.costOfPurchase = 1300000;
        System.out.println(car);
        Car newCar = new Car("Black", "BMW", 1, 15000000);
        System.out.println(newCar);

        Default def = new Default();

    }
}
