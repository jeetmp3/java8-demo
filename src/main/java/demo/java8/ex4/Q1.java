package demo.java8.ex4;

/**
 * Created by jitendra on 2/27/16.
 */
public interface Q1 {
    default void display() {
        System.out.println("In default");
    }

    static void staticDisplay() {
        System.out.println("In static");
    }
}
