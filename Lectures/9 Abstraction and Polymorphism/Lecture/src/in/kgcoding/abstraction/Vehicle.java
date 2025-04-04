package in.kgcoding.abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTires;

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going....");
    }

    public abstract void makeStratSound();
}
