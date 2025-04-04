package in.kgcoding.inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("numberOfTires=").append(numberOfTires);
        sb.append('}');
        return sb.toString();
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}
