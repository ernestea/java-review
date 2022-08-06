package set_review;

import model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. Creating a set of students
        Set<Student> studentSet = new HashSet<>();
        //2. Adding students to set
        studentSet.add(new Student("Nelson",21,2));
        studentSet.add(new Student("Mandela",22,3));
        studentSet.add(new Student("Bryan",34,5));
        studentSet.add(new Student("Nigel",45,1));
        studentSet.add(new Student("Nigel",45,1));

        System.out.println(studentSet);

        //Find first repeating character using hashset
        problemSolution1("Java Developer");
        problemSolution2("Java Developer");
    }

    static void problemSolution1(String input) {
        Set<Character> set = new HashSet<>();
        for (char character : input.toCharArray()) {
            if (set.contains(character)) {
                System.out.println("This is the first character that repeats more than 1 time => " + character);
                return;
            }else{
                set.add(character);
            }
        }
    }

    static void problemSolution2(String input) {
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.add(c)) {
                System.out.println(c);
                return;
            }
        }
    }
}
