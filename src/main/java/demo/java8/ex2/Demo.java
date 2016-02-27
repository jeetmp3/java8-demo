package demo.java8.ex2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by jitendra on 2/27/16.
 */
public class Demo {
//    int a;
//    int b;

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

        Ques1 quesAdd = demo::add;
        System.out.println(quesAdd.getClass());
//        Ques1 quesSub = demo::subtract;
//        Ques1 quesMulti = Demo::multiply;
//
//        System.out.println(quesAdd.op(2, 3));
//        System.out.println(quesSub.op(2, 3));
//        System.out.println(quesMulti.op(2, 3));
//
        Ques2 ques2 = Employee::new;
        System.out.println(ques2.getClass());
//
//        System.out.println(ques2.construct("Jittu", 30, "Noida"));
//        System.out.println(ques2.construct("Komal", 26, "Delhi"));

//        Integer i = 200, j = 200;
//        System.out.println(i == j);

        IntConsumer intConsumer = System.out::println;
        Integer x = 10;
        intConsumer.accept(x);

        Consumer<Object> consumer = System.out::println;
        consumer.accept(10);


    }

    void test () {
//        Integer x = 10;
//
//        if(x>5){
//            Ques1 ques1 = (a, b)-> {
//                return a+b+x;
//            };
//            System.out.println();
//        }else{
//            x = Integer.valueOf(20);
//        }
    }

}

