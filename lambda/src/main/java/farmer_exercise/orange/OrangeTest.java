package farmer_exercise.orange;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(500, Color.GREEN));
        inventory.add(new Orange(200, Color.ORANGE));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(180).color(Color.YELLOW).build());
//        inventory.add(Orange.builder().weight(200).build()); using builder lets me create a new object with specific fields initialized only

        OrangeFormatter simpleFormatter =  orange -> "This orange is color " + orange.getColor();
//        prettyPrintOrange(inventory, simpleFormatter);
        prettyPrintOrange(inventory, orange -> "This orange is color " + orange.getColor());

        OrangeFormatter fancyForamtter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };

        prettyPrintOrange(inventory, fancyForamtter);

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter) {
        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
