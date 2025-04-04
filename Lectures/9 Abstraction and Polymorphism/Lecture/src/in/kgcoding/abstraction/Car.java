package in.kgcoding.abstraction;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void makeStratSound() {
        System.out.println("Vroom.....");
    }

    @Override
    public void getSetGo() {
        System.out.println("commuting");
    }
}
