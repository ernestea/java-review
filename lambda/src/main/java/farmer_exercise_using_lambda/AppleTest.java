package farmer_exercise_using_lambda;

import farmer_exercise.apple.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    List<Apple> apples = new ArrayList<>();

    {
        apples.add(new Apple(Color.GREEN, 201));
        apples.add(new Apple(Color.RED, 199));
        apples.add(new Apple(Color.GREEN, 160));
        apples.add(new Apple(Color.YELLOW, 100));
        apples.add(new Apple(Color.GREEN, 205));
        apples.add(new Apple(Color.RED, 300));
        apples.add(new Apple(Color.YELLOW, 199));
        apples.add(new Apple(Color.GREEN, 200));
        apples.add(new Apple(Color.RED, 500));
    }

    public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> function) {
        System.out.println("Java Predicate is used");
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : list) {
            if (function.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    public static List<Apple> filterApples(List<Apple> list, ApplePredicate function) {
        System.out.println("Custsom ApplePredicate is used");
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : list) {
            if (function.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    @Test
    public void greenColorPredicate() {

        Predicate<Apple> greenColorPredicate = (apple) -> apple.getColor() == Color.GREEN;
        List<Apple> greenApples = filterApples(apples, greenColorPredicate);
        System.out.println(greenApples);
    }
    @Test
    public void greenColorPredicate2() {
        ApplePredicate greenColorPredicate = new AppleGreenColorPredicate();
        List<Apple> greenApples = filterApples(apples, greenColorPredicate);
        System.out.println(greenApples);
    }

    @Test
    public void heavyApplesPredicate() {
        Predicate<Apple> heavyPredicate = apple -> apple.getWeight() > 200;
        List<Apple> heavyApples = filterApples(apples, heavyPredicate);
        System.out.println(heavyApples);
    }
    @Test
    public void heavyApplesPredicate2() {
        ApplePredicate heavyPredicate = new AppleHeavyPredicate();
        List<Apple> heavyApples = filterApples(apples, heavyPredicate);
        System.out.println(heavyApples);
    }

    @Test
    public void greenColorPredicate3() {
        List<Apple> greenApples = filterApples(apples, (apple) -> apple.getColor() == Color.GREEN);
        System.out.println(greenApples);
    }

    @Test
    public void heavyApplesPredicate3() {
        List<Apple> heavyApples = filterApples(apples, apple -> apple.getWeight() > 200);
        System.out.println(heavyApples);
    }



}
