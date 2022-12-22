import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<String> checkDownMargin = str -> str.length() > 5;
        Predicate<String> checkUpperMargin = str -> str.length() < 8;

        var result = checkDownMargin.and(checkUpperMargin).test("bluesky");
        System.out.println(result);

    }
}
