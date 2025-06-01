package Java8Features.LamdaDemos.LamdaExpression;

public class LamdaTest {
    public static void main(String[] args) {
//        Employee engineer = new SoftwareEngineer();
//        System.out.println(engineer.getName());


        Employee engineer = () -> {
            return "Software Engineer interface";
        };
        System.out.println(engineer.getName());


    }
}
