import dish.Dish;
import dish.DishData;
import org.testng.annotations.Test;

import java.util.Optional;

public class MatchingAndFinding {

    @Test
    public void allMatchExample() {//ALL MATCH
        boolean isHealthy = DishData.readAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);
    }

    @Test
    public void anyMatchExample() {//ANY MATCH
        if(DishData.readAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("Menu is vegeterian friendly");
        }
    }

    @Test
    public void noneMatchExample() {//NONE MATCH
        boolean isHealthy = DishData.readAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy);
    }

    @Test
    public void findAnyExample() {//FIND ANY
        Optional<Dish> optionalDish = DishData.readAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(optionalDish);
        System.out.println(optionalDish.get());
    }

    @Test
    public void findFirstExample() {
        Optional<Dish> optionalDish = DishData.readAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(optionalDish);
        System.out.println(optionalDish.get());
    }
}
