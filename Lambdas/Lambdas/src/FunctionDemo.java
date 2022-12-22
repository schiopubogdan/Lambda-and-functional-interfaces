import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> findLength = str -> str.length();
        var length = findLength.apply("Demo");
        System.out.println(length);

        //Metode specializate pentru return type Integer, Long, Double
        ToIntFunction<String> findLength2 = str -> str.length();
        var length2 = findLength2.applyAsInt("Demo");
        System.out.println(length2);

        ToDoubleFunction<String> findLength3 = str -> str.length();
        var length3= findLength3.applyAsDouble("Demo");
        System.out.println(length3);

        //Metode specializate
        IntToLongFunction function = x -> x*x;
        var result = function.applyAsLong(10);
        System.out.println(result);

        //Chaining functions
        // initial: key:value
        // 1 transform : key=value
        // 2 transform : {key=value}
        // 3 transform : {KEY=VALUE}

        Function<String, String> first = str -> str.replace(":","=");
        Function<String, String> second = str -> "{" + str + "}";
        Function<String, String> third = str -> str.toUpperCase();

        var resultedfString = first.andThen(second).andThen(third).apply("key:value");
        System.out.println(resultedfString);
    }
}
