package Comparable;

public class Student implements Comparable<Student> {
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int compareTo(Student s) {
        return s.id.compareTo(this.id);
    }
}
