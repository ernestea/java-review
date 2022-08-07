package farmer_exercise;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }

    @Override
    public String prettify(Apple apple) {
        return "This apple's Color is " + apple.getColor();
    }
}
