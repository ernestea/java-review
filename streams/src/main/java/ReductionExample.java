import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void sum() {
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(sum.get());
    }

    @Test
    public void minMax() {
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(max);
        System.out.println(min);
    }

    @Test
    public void exampple3() {
        Optional<Integer> result = numbers.stream().reduce(Integer::sum);
        System.out.println(result.get());
    }
    @Test
    public void example2() {
        Optional<Integer> result = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result);
        System.out.println(result.get());
    }

    @Test
    public void example1() {

        int result = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }


}
