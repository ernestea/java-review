import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    String[] courses = {"JAVA","JavaScript","Python","Ruby"};
    List<Course> courseList = Arrays.asList(
            new Course("Java",1),
            new Course("JavaScript",2),
            new Course("Python",3),
            new Course("Ruby",4)
            );


    @Test
    public void example4() {
        Stream<Integer> stream = Stream.of(1,2,3,4,6);
    }

    @Test
    public void example3() {
        Stream<Course> courseStream = courseList.stream();
    }
    @Test
    public void example2() {
        List<String> courseList = Arrays.asList(courses);
        Stream<String> courseStream = courseList.stream();
    }



    @Test
    public void example1() {
        Stream<String> courseStream = Arrays.stream(courses);
    }




}
