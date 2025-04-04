package in.kgcoding.inheritance;

import in.kgcoding.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getClass());
        System.out.println(vehicle.hashCode());

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.numberOfTires = 2;
        motorCycle.balance();
        motorCycle.commute();
        motorCycle.start();
    }
}
