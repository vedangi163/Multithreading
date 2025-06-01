package Java8Features.LamdaDemos.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
//        Engineer engineer = new Engineer();
//        System.out.println(engineer.getDesignation()+ " "+engineer.getName());


        //sincce interface has 2 abstract methods cannot use Lamda here, hemce use anonymous inner class

        Employee employee = new Employee() {
            public String getName() {
                return "John";
            }
            public String getDesignation() {
                return "Engineer";
            }
        };

        System.out.println(employee.getName()+"  "+employee.getDesignation());
    }
}
