package in.kgcoding.challenge102;

public enum TrafficColor {
    RED(9000),GREEN(5000), YELLOW(3000);

    private final int onTimeInMilis;

    TrafficColor(int onTimeInMilis) {
        this.onTimeInMilis = onTimeInMilis;
    }

    public int getOnTimeInMilis() {
        return onTimeInMilis;
    }
}
