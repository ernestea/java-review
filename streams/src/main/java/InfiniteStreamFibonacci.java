import org.testng.annotations.Test;

import java.util.stream.Stream;

public class InfiniteStreamFibonacci {

    @Test
    public void solution1() {//Fibonacci
        int[] seed = new int[]{0,1};
        Stream.iterate(seed,(a) -> new int[]{a[1], a[1] + a[0]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

    }
}
