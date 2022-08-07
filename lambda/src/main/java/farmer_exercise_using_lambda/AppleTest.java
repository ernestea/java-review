package farmer_exercise_using_lambda;

import farmer_exercise.Apple;
import farmer_exercise.AppleGreenColorPredicate;
import farmer_exercise.AppleHeavyPredicate;
import farmer_exercise.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Color.GREEN, 201));
        apples.add(new Apple(Color.RED, 199));
        apples.add(new Apple(Color.GREEN, 160));
        apples.add(new Apple(Color.YELLOW, 100));
        apples.add(new Apple(Color.GREEN, 205));
        apples.add(new Apple(Color.RED, 300));
        apples.add(new Apple(Color.YELLOW, 199));
        apples.add(new Apple(Color.GREEN, 200));
        apples.add(new Apple(Color.RED, 500));

        Predicate<Apple> greenColorPredicate = (apple) -> apple.getColor() == Color.GREEN;
        List<Apple> greenApples = filterApples(apples, greenColorPredicate);
        System.out.println(greenApples);

        Predicate<Apple> heavyPredicate = apple -> apple.getWeight() > 200;
        List<Apple> heavyApples = filterApples(apples,heavyPredicate);
        System.out.println(heavyApples);



//        List<Apple> heavyApples = filterApples(apples, new AppleHeavyPredicate());
//        System.out.println(heavyApples);
//
//        prettyPrintApple(apples, new AppleGreenColorPredicate());
//        prettyPrintApple(apples, new AppleHeavyPredicate());
    }

    public static List<Apple> filterApples(List<Apple> list, Predicate<Apple> function) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : list) {
            if(function.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }
}
