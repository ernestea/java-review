package functional_interfaces;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    List<User> listOfUsers = new ArrayList<>();

    {
        listOfUsers.add(new

                User("Ernest", "Kozhokmatov", 22));
        listOfUsers.add(new

                User("Zhalboush", "Sina", 21));
        listOfUsers.add(new

                User("Mike", "Alamo", 33));
        listOfUsers.add(new

                User("Star", "Enterprise", 44));
        listOfUsers.add(new

                User("Michael", "Johns", 55));
    }

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }

    @Test
    public void printAllElementsInTheList() {
        printName(listOfUsers, user -> true);
    }

    @Test
    public void printAllElementsThatLastNameStartWithE() {
        printName(listOfUsers, user -> user.getLastName().startsWith("E"));
    }


}
