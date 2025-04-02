package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //process collection using declarative & functional programming

        //intermediate & terminal operations
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        numbers.stream().filter(x -> x % 2 == 0).count();

        //stream -> sequence of elements supporting functional & terminal operations

        //Generate streams
        //1.
        List<Integer> list = new ArrayList<>(numbers);
        Stream<Integer> stream = list.stream();

        //2.
        String[] arr = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);

        //3
        Stream<String> names = Stream.of("a", "b", "c");




    }

}

