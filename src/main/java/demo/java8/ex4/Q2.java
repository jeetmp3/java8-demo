package demo.java8.ex4;

/**
 * Created by jitendra on 2/27/16.
 */
public interface Q2 {
    default void display() {
        System.out.println("In Display :: Q2");
    }

    static void staticDisplay() {
        System.out.println("In Static Display :: Q2");
    }
}
