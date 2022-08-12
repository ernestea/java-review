package farmer_exercise.functional_interfaces;

import org.testng.annotations.Test;

import java.util.function.*;

public class Examples {
    @Test
    public void example1PredicateInterface() {
        Predicate<Integer> lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };
        System.out.println(lesserThan.test(500));
    }

    @Test
    public void example2PredicateInterface() {
        Predicate<Integer> lesserThan = integer -> integer < 18;
        System.out.println(lesserThan.test(500));
    }

    @Test
    public void example3ConsumerInterface() {//***********CONSUMER****************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(44);
    }

    @Test
    public void example4BiConsumerInterface() {//***********BICONSUMER****************//
        BiConsumer<Integer, Integer> addTwo = (i, j) -> System.out.println(i + j);
        addTwo.accept(4, 5);
    }

    @Test
    public void example5FunctionInterface() {//***********FUNCTION****************//
        Function<String,String> function = s -> "Hello " + s;
        String result = function.apply("Ernest");
        System.out.println(result);
    }
    @Test
    public void example6SupplierInterface() {//***********SUPPLIER****************//
        Supplier<Double> randomValue = () -> Math.random();
        Double result = randomValue.get();
        System.out.println(result);
    }


}
