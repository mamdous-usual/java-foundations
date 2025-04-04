package in.kgcoding.challenge97;

public class TestEnums {
      public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}
