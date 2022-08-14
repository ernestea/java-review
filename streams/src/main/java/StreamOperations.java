import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 3, 8);

    @Test
    public void example5() {//SKIP
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void example4() {//LIMIT
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void example3() {//FILTER
        list.stream()
                .filter(i -> i % 2 == 0)//first intermediate operation
                .distinct() //second intermediate operation that is removing duplicates
                .forEach(System.out::println);//Stream forEach is used
    }

    @Test
    public void example2() {//FILTER
        list.stream()
                .filter(i -> i % 2 == 0) //single intermediate operation is being used
                .forEach(System.out::println);//Stream forEach is used
    }

    @Test
    public void example1() {

        list.forEach(x -> System.out.println(x));//Iterable forEach is used
        list.forEach(System.out::println);
    }
}
