package Java8Features.StreamPreRequisites;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        //Consumer is used to only accept & consume the data that's it
        Consumer<String> consumer = x -> System.out.println("Name is: "+x);
        consumer.accept("Vedangi");


        Consumer<List<Integer>> listConsumer = x -> {
            for(Integer i : x) {
                System.out.println(i);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));


        Consumer<List<Integer>> listConsumer2 = x -> {
            for(Integer i : x) {
                System.out.println(100+i);
            }
        };
        listConsumer.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4));
    }
}
