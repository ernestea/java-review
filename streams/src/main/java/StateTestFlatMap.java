import org.testng.annotations.Test;
import state.State;

import java.util.List;

public class StateTestFlatMap {

    List<State> states = List.of(
            new State("Arkansas"),
            new State("Illinois"),
            new State("California"),
            new State("New York"),
            new State("Pennsylvania"),
            new State("Arizona"),
            new State("Texas"),
            new State("New Mexico"),
            new State("Idaho")
    );
    {
        states.forEach(state -> {
            state.addCity(state.getName() + " city1");
            state.addCity(state.getName() + " city2");
            state.addCity(state.getName() + " city3");
        });
    }

    @Test
    public void example1() {
        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
