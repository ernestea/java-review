import dish.Dish;
import dish.DishType;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTest {
    List<Dish> menu = Arrays.asList(
            new Dish("pork",false,800, DishType.MEAT),
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

    @Test
    public void solution3() {//Print the length of the name of each dish that is less than 400 cal
        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    public void solution4() {//Print 3 high caloric dish name (> 300)
        menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

    }

    @Test
    public void solution5() {//Print all dish name that are below 400 calories in sorted by calories ascending
        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

    }

    @Test
    public void solution6() {//Print all dish name that are below 400 calories in sorted by calories descending
        menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }



}
