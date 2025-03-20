package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Student s1 = new Student(100, "jdsak");
        Student s2 = new Student(10, "jdsak");

        List<Student> list = new ArrayList<>(List.of(s1, s2));
        Collections.sort(list);
        for(Student student : list) {
            System.out.println(student.id);
        }
    }
}
