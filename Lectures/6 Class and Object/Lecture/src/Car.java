public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    int noOfSeats;
    float currentFuelInLiters;
    static {
        noOfCarsSold = 0;
        System.out.println("I am in static Block");
    }
    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }
    Car(String color) {
        noOfSeats = 5;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        this.color = color;
        noOfWheels = 4;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }


    public Car start() {
        int pop = 5;
        if (currentFuelInLiters == 0) {
            System.out.println(pop);
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started...");
        }
        return this;
    }
    public void drive() {
       System.out.println("Car is driving");
       currentFuelInLiters--;
   }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am in finalize");
       }
}