import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DishTest {
    List<Dish> menu = Arrays.asList(
            new Dish("pork",false,800,DishType.MEAT),
            new Dish("beef",false,700,DishType.MEAT),
            new Dish("chicken",false,850,DishType.MEAT),
            new Dish("fries",true,400,DishType.OTHER),
            new Dish("fruit",true,360,DishType.OTHER),
            new Dish("pizza",true,890,DishType.OTHER),
            new Dish("prawns",false,245,DishType.FISH),
            new Dish("salmon",false,550,DishType.FISH)

    );



    @Test
    public void solution1() {//Print all dishes' name that has less then 400 calories
        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);
    }
    @Test
    public void solution2() {//Print the length of the name of each dish
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
    }



}
