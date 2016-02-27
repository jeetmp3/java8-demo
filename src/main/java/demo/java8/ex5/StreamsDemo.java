package demo.java8.ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by jitendra on 2/27/16.
 */
public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 8, 5, 7, 6, 3, 1);
        System.out.println(
                list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList())
        );

        System.out.println(
                list.stream().filter(e -> e > 5).collect(Collectors.summingInt(e -> e))
        );

        System.out.println(
                list.stream().mapToInt(e -> e * 2).average().getAsDouble()
        );

        System.out.println(
                list.stream().filter(e -> e % 2 == 0 && e > 3).collect(Collectors.toList())
        );
    }
}
