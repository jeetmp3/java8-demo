package demo.java8;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Created by jitendra on 2/27/16.
 */
public class CodeDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = ( Integer a, Integer b) -> {
            return (a >= b ? 0 : -1);
        };
        System.out.println(comparator.compare(10, 12));
        System.out.println(comparator.compare(10, 10));
        System.out.println(comparator.compare(12, 10));

        IntFunction<Integer> increment = (a) -> ++a;
        System.out.println(increment.apply(2));

        BiFunction<String, String, String> function = (a,b) -> (a+b);
        System.out.println(function.apply("Komal", " Gupta"));

        Function<String, String> changeCase = (name) -> name.toUpperCase();
        System.out.println(changeCase.apply("jittu"));
    }
}
