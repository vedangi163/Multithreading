package Java8Features.StreamPreRequisites;

import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "David");
        names.forEach(x -> System.out.print(x+" "));

        System.out.println();
        names.forEach(Test::print);
    }
}



class Test {
    static void print(String name) {
        System.out.print(name+" ");
    }
}