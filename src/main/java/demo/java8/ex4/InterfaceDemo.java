package demo.java8.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jitendra on 2/27/16.
 */
public class InterfaceDemo implements Q1, Q2 {
    public static void main(String[] args) {
//        Q1.staticDisplay();
//        Q2.staticDisplay();
//        InterfaceDemo interfaceDemo = new InterfaceDemo();
//        interfaceDemo.display();


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4);
        System.out.println(
                list.stream().collect(Collectors.toMap(e->e, e-> e*2, (a,b)-> b))
        );
    }

    public void display() {
        Q1.super.display();
        Q2.super.display();
        System.out.println("Komal's method");
    }
}
