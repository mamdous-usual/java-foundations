package in.kgcoding;

import in.kgcoding.inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        setNumberOfTires(2);
        numberOfTires = 2;
    }

   public void balance() {
       System.out.println("I am balancing on two tires");
   }

}
