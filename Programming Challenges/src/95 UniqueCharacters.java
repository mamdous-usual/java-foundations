import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String userStr = input.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.printf("Your string had %d unique characters", unique.size());

    }
}
