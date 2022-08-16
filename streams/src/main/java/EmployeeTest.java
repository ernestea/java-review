import employee.Employee;
import employee.EmployeeData;
import org.testng.annotations.Test;

import java.util.List;

public class EmployeeTest {//map() vs flatMap()
    @Test
    public void example1() {//Print all emails - One to One (1 emp has 1 email  => map() used)
        EmployeeData.readAll()
                .map(Employee::getEmail)
                .forEach(System.out::println);

    }

    @Test
    public void example2() {//Print all phone numbers - One to Many (1 emp has 1 list of phone numbers  => map() used)
        EmployeeData.readAll()
                .map(Employee::getPhoneNumbers)
                .forEach(System.out::println);

    }

    @Test
    public void example3() {//Print all phone numbers - One to Many (1 emp has 1 list of phone numbers  => flatMap() used)
        EmployeeData.readAll()
                .map(Employee::getPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
