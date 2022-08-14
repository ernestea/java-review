package farmer_exercise.doublecolonoperator;

import org.testng.annotations.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class CalculatorTest {

    @Test
    public void doubleColonStaticUsageTest1() {
        Calculatable s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(5, 6);

        Calculatable s2 = Calculator::findSum;
        s2.calculate(5, 6);
    }

    @Test
    public void doubleColonInstanceUsageTest2() {
        Calculatable s1 = (x, y) -> new Calculator().findMultiply(x, y);
        s1.calculate(5, 6);

        Calculator obj = new Calculator();
        Calculatable s2 = obj::findMultiply;
        s2.calculate(5, 6);
    }

    @Test
    public void biFunctionDoubleColonUsageTest1() {
        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        String output = fn.apply("Developer Ernest", 6);
        System.out.println(output);

        fn = String::substring;
        output = fn.apply("Developer Ernest", 8);
        System.out.println(output);
    }

    @Test
    public void biFunctionDoubleColonUsageTest2() {
        BiFunction<Calculator, Integer, Integer> fn2 = (calculator, i) -> calculator.squareValue(i);
        int output = fn2.apply(new Calculator(), 5);
        System.out.println(output);

        fn2 = Calculator::squareValue;
        output = fn2.apply(new Calculator(),6);
        System.out.println(output);
    }

    @Test
    public void consumerFunctionalInterface1() {
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(55);
    }

    @Test
    public void consumerFunctionalInterface2() {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(55);
    }
    @Test
    public void example7BiFunctionInterface() {
        BiFunction<MyClass,Integer,Double> fn = MyClass::method1;
        System.out.println(fn.apply(new MyClass(), 5));

        Function<Integer,Double> fn1 = new MyClass()::method1;
        System.out.println(fn1.apply(5));

    }
}


