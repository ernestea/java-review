import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
//        List<Student> students = new ArrayList<>();
//        List<Student> students = new ArrayList<>();
        //Add elements to ArrayList
        students.add(new Student("Jose", 1));
        students.add(new Student("Said", 2));
        students.add(new Student("Nigel", 3));
        students.add(new Student("Ronnie", 4));

//        System.out.println(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
//
        for (Student student : students) {
            System.out.println(student);
        }
//
        students.forEach(student -> System.out.println(student));
//
        students.forEach(System.out::println);

    }
}
