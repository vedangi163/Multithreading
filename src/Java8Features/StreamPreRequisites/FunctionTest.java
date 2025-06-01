package Java8Features.StreamPreRequisites;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        //Function actually does some function, takes 2 arguments
        //it take arg and returns something
        //apply() abstract method
        //compose(), andThen() default methods


        Function<String, Integer> length = (s) -> s.length();
        System.out.println(length.apply("Vedangi"));

        Function<String, String> substr = (s) -> s.substring(0, 3);
        System.out.println(length.apply("Vedangi"));

        Function<String, Integer> andThen = substr.andThen(length);
        System.out.println(andThen.apply("Vedangi"));






    }
}
