package demo.java8.ex6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jitendra on 2/27/16.
 */
public class TestParallel {
    static String getName(Integer engine) {
        try {
            if (engine == 0) {
                System.out.println("000000000000000000");
                Thread.sleep(5000);
                return "Google";
            } else if (engine == 1) {
                System.out.println("1111111111111111111");
                Thread.sleep(1000);
                return "Yahoo";
            } else {
                System.out.println("22222222222222222222");
                Thread.sleep(10000);
                return "Bing";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "DFSLDFKSKF";
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 0, 1, 2);

        System.out.println(
                list.parallelStream().map(TestParallel::getName).findFirst().get()
        );
    }
}
