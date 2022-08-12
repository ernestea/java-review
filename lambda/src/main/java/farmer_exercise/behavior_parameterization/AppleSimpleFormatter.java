package farmer_exercise.behavior_parameterization;

import farmer_exercise.apple.Apple;

public class AppleSimpleFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
