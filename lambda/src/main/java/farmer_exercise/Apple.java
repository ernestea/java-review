package farmer_exercise;

import java.awt.*;

public class Apple {
    Color color;
    double weight;

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Apple(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }
}
