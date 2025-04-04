package in.kgcoding.polymorphism;

class Car extends Vehicle{
    Car() {
        super();
    }

    Car(int noOfTires) {
        super(noOfTires);
    }

    public int noOfDoors() {
        return 5;
    }

    @Override
    public void start() {
        super.getNoOfTires();
        System.out.println("Car is starting");
    }
}
