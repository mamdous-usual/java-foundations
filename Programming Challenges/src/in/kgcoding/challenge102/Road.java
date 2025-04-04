package in.kgcoding.challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();


    }
}
