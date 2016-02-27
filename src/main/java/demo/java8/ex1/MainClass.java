package demo.java8.ex1;

/**
 * Created by jitendra on 2/27/16.
 */
public class MainClass {
    public static void main(String[] args) {
        Q1 q1 = (a, b) -> a > b;
        System.out.println(q1.compare(10, 12));
        System.out.println(q1.compare(10, 10));
        System.out.println(q1.compare(12, 10));

        Q2 q2 = (a) -> ++a;

        Q3 q3 = (s1, s2) -> s1 + s2;

        Q4 q4 = (s) -> s.toUpperCase();

        System.out.println(q2.inc(2));
        System.out.println(q3.concat("Komal", " Gupta"));
        System.out.println(q4.toUpper("Jittu"));

        Chalega chalega = new Chalega(12);
        System.out.println(chalega);

    }
}
