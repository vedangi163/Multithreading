package BuilderDomainDP;

public class Student {
    int id;
    String name;
    int age;

    Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    String getStudentString() {
        return "name: " + name + ", age: " + age + ", id: " + id;
    }

    static class Builder {
        int id;
        String name;
        int age;

        public Builder setId(int id) {       //point to note here is that all setters of builder DP returns me the Builder and not the Student
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Student build() {
            return new Student(this);
        }
    }
}
