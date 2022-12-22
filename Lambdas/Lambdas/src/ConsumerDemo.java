import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);

        //Abordarea imperativa
        for (var i : list )
            System.out.println(i);

        //Abordarea declarativa
        list.forEach(i -> System.out.println(i));

        //Ce face instructiunea de mai sus "under the hood"
        Consumer<Integer> consumer = m -> System.out.println(m);
        for (var i: list)
            consumer.accept(i);

        //Consumers chaining
        List<String> strings = List.of("a","b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        Consumer<String> addBraces = item -> System.out.println("{ " + item + " }");
        strings.forEach(print.andThen(printUpperCase).andThen(addBraces));

    }
}
