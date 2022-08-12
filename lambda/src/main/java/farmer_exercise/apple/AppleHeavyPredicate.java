package farmer_exercise.apple;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.weight > 200;
    }

    @Override
    public String prettify(Apple apple) {
        return "This apple's weight is " + apple.getWeight();
    }

}
