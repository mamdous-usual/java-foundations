package in.kgcoding.challenge84;

public class Eagle extends Bird{

    public Eagle(String breed) {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
