package farmer_exercise.functional_interfaces;

import org.testng.annotations.Test;

import java.util.function.Predicate;

public class Examples {
    @Test
    public void examplePredicateInterface1() {
        Predicate<Integer>  lesserThan = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };
        System.out.println(lesserThan.test(500));
    }

    @Test
    public void examplePredicateInterface2() {
        Predicate<Integer>  lesserThan = integer-> integer < 18;
        System.out.println(lesserThan.test(500));
    }


}
