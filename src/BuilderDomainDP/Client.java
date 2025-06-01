package BuilderDomainDP;

public class Client {
    public static void main(String[] args) {
        Student.Builder builder = new Student.Builder();

        Student s1 = builder.setAge(20).setId(10).build();
        Student s2 = builder.setAge(20).setName("Vedangi").build();

        System.out.println(s1.getStudentString());

        System.out.println(s2.getStudentString());

    }
}
