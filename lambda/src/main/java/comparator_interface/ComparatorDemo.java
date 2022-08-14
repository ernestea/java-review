package comparator_interface;

import static java.util.Comparator.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    private List<Integer> list = Arrays.asList(10,5,0,-2,6,89);

    @Test
    public void sort() {
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    @Test
    public void sort1() {
        System.out.println(list);
        Collections.sort(list, new MyComparator());//Descending order
        System.out.println(list);
    }

    @Test
    public void sort2() {//Ascending order
        System.out.println(list);
        Collections.sort(list,(o1,o2) -> (o1 < o2) ? -1 : (o2 == o1) ? 0 : 1);
        System.out.println(list);
    }
    @Test
    public void sort3() {//Ascending order
        System.out.println(list);
        list.sort((o1,o2) -> (o1 < o2) ? -1 : (o2 == o1) ? 0 : 1);
        System.out.println(list);
    }
    @Test
    public void sort4() {//Descending order
        System.out.println(list);
        list.sort((o2,o1) -> (o1 < o2) ? -1 : (o2 == o1) ? 0 : 1);
        System.out.println(list);
    }

    @Test
    public void sort5() {//Descending order
        System.out.println(list);
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);
    }
    @Test
    public void sort6() {//Ascending order
        System.out.println(list);
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);
    }

    @Test
    public void sort7() {//Ascending order
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    @Test
    public void exampleComparatorComparing() {

        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(55, Color.RED),
                new Apple(60,Color.GREEN)
        );
        Comparator<Apple> sortApple = Comparator.comparing(apple ->apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing((apple) -> apple.getWeight()));
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);
    }

    @Test
    public void example2Comparator() {
        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(55, Color.RED),
                new Apple(60,Color.GREEN)
        );
        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

    }
}
