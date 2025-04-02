package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    //used to convert one stream to another
    //it won't execute until you do terminal operations
    //intermediate operations won't execute until we call terminal operations

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<String> strings = new ArrayList<>(Arrays.asList("Vedangi", "Pooja", "Anika"));

        //1. filter -> predicate
        System.out.println(numbers.stream().filter(n -> n % 2 == 0).count());

        //2. map
        System.out.println(numbers.stream().map(x -> x * x).limit(2).collect(Collectors.toList()));

        //3. sorted.
        System.out.println(numbers.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted((a, b) -> Integer.compare(a, b)).collect(Collectors.toList()));
        System.out.println(strings.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));

        //4. distinct
        numbers.add(10);
        System.out.println(numbers.stream().sorted().distinct().collect(Collectors.toList()));

        //5. skip
        numbers.stream().skip(1).forEach(x -> System.out.print(" "+x));
    }
}
