package dish;

import java.util.Arrays;
import java.util.List;

public class DishData {
    static List<Dish> menu = Arrays.asList(
            new Dish("pork",false,800, DishType.MEAT),
            new Dish("beef",false,700,DishType.MEAT),
            new Dish("chicken",false,850,DishType.MEAT),
            new Dish("fries",true,400,DishType.OTHER),
            new Dish("fruit",true,360,DishType.OTHER),
            new Dish("pizza",true,890,DishType.OTHER),
            new Dish("prawns",false,245,DishType.FISH),
            new Dish("salmon",false,550,DishType.FISH)

    );

    public static List<Dish> readAll() {
        return menu;
    }
}