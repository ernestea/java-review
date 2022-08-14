package employee;

import employee.Employee;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Michael1", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(101, "Michael2", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(102, "Michael3", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(103, "Michael4", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(104, "Michael5", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(105, "Michael6", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(106, "Michael7", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(107, "Michael8", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(108, "Michael9", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(109, "Michael10", "mike@gmail.com", List.of("444-333-4446", "445-555-6666")),
                new Employee(110, "Michael11", "mike@gmail.com", List.of("444-333-4446", "445-555-6666"))
        );
    }

}
