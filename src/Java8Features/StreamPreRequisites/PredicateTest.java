package Java8Features.StreamPreRequisites;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
       //Predicate is Functional interface with test() abstract method
       // and(), or(), negateTo() default methods


        Predicate<Integer> isOdd = (x) -> x%2 == 1;
        System.out.println(isOdd.test(5));

        Predicate<Integer> isEven = (x) -> x%2 == 0;
        System.out.println(isEven.test(10));

        Predicate<String> startsWithV = (x) -> x.startsWith("V");
        Predicate<String> endsWithI = (x) -> x.endsWith("I");
        Predicate<String> and = endsWithI.and(startsWithV);

        System.out.println(and.test("Vedangi"));


        System.out.println(isOdd.negate().test(10));


    }
}
