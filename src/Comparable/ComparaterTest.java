package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaterTest {
    public static void main(String[] args) {
        Student s1 = new Student(100, "jdsak");
        Student s2 = new Student(10, "jdsak");

        List<Student> list = new ArrayList<>(List.of(s1, s2));
        Collections.sort(list, new IdComparator());
        for(Student student : list) {
            System.out.println(student.id);
        }
    }
}


class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}
