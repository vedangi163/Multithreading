package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 9, 2, 20);
        //Straem creation ways
        //1.
        Stream<Integer> stream = list.stream();
        Integer[] nums = {10, 30, 20};
        //2.
        Stream<Integer> stream1 = Arrays.stream(nums);
        //3.
        Stream<Integer> stream2 = Stream.of(10, 30, 40);

        int sum = 0;
        for (int i=0; i<list.size(); i++) {
            if(list.get(i) % 2 == 0)
                sum = sum + list.get(i);
        }
        System.out.println(sum);


        System.out.println(list.stream().filter(x -> x %2 ==0).reduce((x, y) -> x+y).get());


        List<Integer> list1 = Arrays.asList(1, 2, 34, 2, 1, 34, 6);
        //find even numbers & divide them by 2
        // 1, 17, 3
        List<Integer> ans = list1
                .stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .sorted((a, b) -> b - a)
                .map(x -> x / 2)
                .limit(1)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(ans);
        System.out.println(list1.stream().max(Integer::max).get());
        System.out.println(list1.stream().min(Integer::min).get());
        System.out.println(list1.stream().count());




    }
}
