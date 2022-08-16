package doublecolonoperator;

import org.testng.annotations.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    @Test
    public void constructorReference1() {
        Supplier<Car> s1 =  () -> new Car();
        System.out.println(s1.get().getModel());
    }

    @Test
    public void constructorReference2() {
        Supplier<Car> s1 = Car::new;
        System.out.println(s1.get().getModel());
    }

    @Test
    public void argsConstructorReference1() {
        Function<Integer, Car> f1 = model -> new Car(model);
        System.out.println(f1.apply(2005).getModel());
    }
    @Test
    public void argsConstructorReference2() {
        Function<Integer, Car> f1 = Car::new; //one argument constructor is called when function is used
        System.out.println(f1.apply(2015).getModel());
    }
    @Test
    public void argsConstructorReference3() {
        BiFunction<String,Integer, Car> f1 = Car::new; //two argument constructor is called when Bifunction is used
        System.out.println(f1.apply("Toyota",2015));
    }
}
