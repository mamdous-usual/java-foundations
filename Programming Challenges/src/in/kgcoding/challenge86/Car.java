package in.kgcoding.challenge86;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("Service required for your car");
    }
}
