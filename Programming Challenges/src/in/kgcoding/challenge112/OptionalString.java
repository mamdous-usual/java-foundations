package in.kgcoding.challenge112;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(optionalString(null));
        System.out.println(optionalString(""));
        System.out.println(optionalString("pop"));

    }

    public static Optional<String > optionalString(String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
