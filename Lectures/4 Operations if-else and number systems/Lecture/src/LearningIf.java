import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isMale = false;
        String name = "Hinata";

        System.out.println("Before if!");
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        System.out.println("After if!");


        boolean isSeniorCitizen = false;
        boolean isAdult = true;

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAdult) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Child");
        }
    }
}
