package in.kgcoding.challenge102;

public class TrafficLightThread extends Thread{
    public final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMilis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s inactive\n", color);
    }
}
