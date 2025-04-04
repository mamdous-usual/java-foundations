public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    int modelNo;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, int modelNo, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNo=" + modelNo +
//                ", company='" + company + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNo=").append(modelNo);
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car myCar = new Car(4, 4, 180, "Swift", 5043, "suzuki");
        System.out.println(myCar);
    }
}
