package in.kgcoding.enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Start"), YELLOW("Caution");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
