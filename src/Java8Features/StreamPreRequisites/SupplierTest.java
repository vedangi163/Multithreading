package Java8Features.StreamPreRequisites;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierTest {
    //supplier only supplies the value, so it will take 0 argument & return something in response
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> 11;
        System.out.println("value: " + sup.get());


        Supplier<Integer> supplier = () -> 10;
        Consumer<Integer> consumer = x -> System.out.println("Value: "+x);
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = (x) -> x * x * x;


        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        } else {
            consumer.accept(supplier.get());
        }

    }


}