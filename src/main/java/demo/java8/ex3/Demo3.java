package demo.java8.ex3;

import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by jitendra on 2/27/16.
 */
public class Demo3 implements Test{
    public static void main(String[] args) {
//        Supplier<Integer> supplier = () -> 12;
//        Consumer<Integer> consumer = (a) -> System.out.println(a * a);
//        Predicate<Integer> predicate = (a) -> a > 10;
//        Function<Integer, Integer> function = (a) -> a + 10;
//        consumer.accept(supplier.get());
//        System.out.println(predicate.test(function.apply(0)));
//        System.out.println(predicate.test(function.apply(1)));

        new Demo3().print();
    }

    public void print() {
        for (Method method : Test.class.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
        super.toString();
    }

}
