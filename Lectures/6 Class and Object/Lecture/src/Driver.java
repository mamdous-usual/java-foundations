public class Driver {
    static int minAgeForDriving = 18;
    String name;
    String dateOfLicense;
    int age;

    public boolean isAllowedToDrive() {
        return this.age <= minAgeForDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(7);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Powder Blue");
        Car thar = new Car();
        thar = null;
//        swift.addFuel(10);
        swift.start().drive();
//        Car carStarted = swift.start();
//        carStarted.drive();
        System.out.println(swift.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/jan/2025";
//        System.out.println(minAgeForDriving);
    }
}
