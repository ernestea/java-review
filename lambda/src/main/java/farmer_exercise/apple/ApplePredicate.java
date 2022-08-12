package farmer_exercise.apple;

public interface ApplePredicate {
    boolean test(Apple apple);

    String prettify(Apple apple);
}
