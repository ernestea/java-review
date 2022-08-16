package farmer_exercise.orange;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTest {

    List<Orange> inventory = new ArrayList<>();

    {
        inventory.add(new Orange(500, Color.GREEN));
        inventory.add(new Orange(200, Color.ORANGE));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(180).color(Color.YELLOW).build());
    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter) {
        System.out.println("Custom interface OrangeFormatter is used");
        for (Orange orange : inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }

    private static void prettyPrintOrange(List<Orange> inventory, Function<Orange, String> function) {
        System.out.println("Java interface Function is used");
        for (Orange orange : inventory) {
            String output = function.apply(orange);
            System.out.println(output);
        }
    }


    @Test
    public void simpleFormatter() {
        OrangeFormatter simpleFormatter = orange -> "This orange is color " + orange.getColor();
        prettyPrintOrange(inventory, simpleFormatter);
    }

    @Test
    public void simpleFormatter2() {
        Function<Orange, String> function = orange -> "This orange is color " + orange.getColor();
        prettyPrintOrange(inventory, function);
    }


    @Test
    public void fancyFormatter() {
        OrangeFormatter fancyForamtter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, fancyForamtter);
    }

    @Test
    public void fancyFormatter2() {
        Function<Orange, String> fancyForamtter = (Orange orange) -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, fancyForamtter);
    }


}
