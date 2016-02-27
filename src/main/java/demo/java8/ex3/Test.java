package demo.java8.ex3;

/**
 * Created by jitendra on 2/27/16.
 */
public interface Test {
    default void print() {
        System.out.println("Hello");
    }
}
