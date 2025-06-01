package Java8Features.StreamPreRequisites;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name: "+name+"\n";
    }

}


class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob","David");
        List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students);
    }
}