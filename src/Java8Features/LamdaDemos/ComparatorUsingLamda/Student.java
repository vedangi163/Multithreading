package Java8Features.LamdaDemos.ComparatorUsingLamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


//class NameComparator implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//        return s1.name.compareTo(s2.name);
//    }
//}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");
        Student s3 = new Student(3, "Bob");
        Student s4 = new Student(4, "Jack");
        Student s5 = new Student(5, "Cab");

        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
//        Collections.sort(list, new NameComparator());



        //================= Using Lamda =================
        Comparator<Student> nameComparator = (a, b) -> {
            return a.name.compareTo(b.name);
        };
        Collections.sort(list, nameComparator);
        System.out.println(list);
    }
}
