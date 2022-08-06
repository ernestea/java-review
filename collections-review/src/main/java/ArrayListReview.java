import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Jose", 1));
        students.add(new Student("Said", 2));
        students.add(new Student("Nigel", 3));
        students.add(new Student("Ronnie", 4));

        List<Student> students1 = new Vector<>();

        students1.add(new Student("Jose", 1));
        students1.add(new Student("Said", 2));
        students1.add(new Student("Nigel", 3));
        students1.add(new Student("Ronnie", 4));

        List<Student> students2 = new ArrayList<>();

        students2.add(new Student("Jose", 1));
        students2.add(new Student("Said", 2));
        students2.add(new Student("Nigel", 3));
        students2.add(new Student("Ronnie", 4));

        print(students);
        printForward(students1);
        printBackwards(students2);


    }

    static void print(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Student student : list) {
            System.out.println(student);
        }
        list.forEach(student -> System.out.println(student));
        list.forEach(System.out::println);
    }

    static void printForward(List<Student> studentList) {
        Iterator iterator = studentList.iterator();
        //forward iteration
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<Student> listIterator = studentList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    static void printBackwards(List<Student> studentList) {
        ListIterator<Student> listIterator = studentList.listIterator();
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
