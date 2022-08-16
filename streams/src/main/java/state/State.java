package state;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data

public class State {
    public State(String name) {
        this.name = name;
    }

    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city) {
        this.cities.add(city);
    }

    public List<String> getCities() {
        return this.cities;
    }
}
