package farmer_exercise.apple;

import behavior_parameterization.AppleFancyFormatter;
import behavior_parameterization.AppleFormatter;

import java.util.ArrayList;
import java.util.List;

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
        List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        System.out.println(greenApples);
        List<Apple> heavyApples = filterApples(apples, new AppleHeavyPredicate());
        System.out.println(heavyApples);

        prettyPrintApple(apples,new AppleGreenColorPredicate());
        prettyPrintApple(apples,new AppleHeavyPredicate());

        prettyPrintAppleUsingFormatter(apples,new AppleFancyFormatter());

        AppleFormatter formatter = (apple) -> {return "A " + apple.getColor() + " apple";};
        prettyPrintAppleUsingFormatter(apples,formatter);

    }

    private static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if(predicate.test(apple)) {
                filteredApples.add(apple);
            }
        }
//
//        System.out.println("Green apples are: " + greenApples);
//        System.out.println("Heavy apples are: " + heavyApples);
        return filteredApples;
    }

    private static void prettyPrintApple(List<Apple> inventory, ApplePredicate predicate) {
        for (Apple apple : inventory) {
            String output = predicate.prettify(apple);
            System.out.println(output);
        }
    }

    public static void prettyPrintAppleUsingFormatter(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
