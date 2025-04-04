package in.gettersetter;

public class Car {
    private String color; // public
    private String model; // public
    private double fuelInLiter;
    private long costOfPurchase; // default

    public Car(String color, String model, double fuelInLiter, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelInLiter = fuelInLiter;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
        return  color;
    }

    public double getFuelInLiter() {
        return fuelInLiter;
    }

    public void setFuelInLiter(double fuelInLiter) {
        this.fuelInLiter = fuelInLiter;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void  setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("Pagal hai kya");
        } else {
            this.color = color;
        }
    }
    public String getModel() {
        return model;
    }

 }
