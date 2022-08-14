package behavior_parameterization;

import farmer_exercise.apple.Apple;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "Heavy" : "Light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
