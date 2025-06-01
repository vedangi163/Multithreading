package Java8Features.StreamPreRequisites;

import java.util.function.*;

public class BiEntities {
    public static void main(String[] args) {

        //There is no BiSupplier
        //UnaryOperator -> function<T>
        //BinaryOperator -> BiFunction<T, U, R>
        //UnaryOperator used when input & output type is same
        //BinaryOperator is used when 2 inputs type & 1 output type is same


        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(1, 2));


        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(10, 20));

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("a: "+a+", b: "+b);
        biConsumer.accept(10, 20);

//        Function<Integer, Integer> function = a -> a * a;
//        System.out.println(function.apply(10));

        UnaryOperator<Integer> unaryOperator = a -> a * a;
        System.out.println(unaryOperator.apply(10));

//        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> a + b;
//        System.out.println(biFunction1.apply(1, 2));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(10, 20));



    }
}
