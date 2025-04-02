package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {
    Thread t2 = new Thread(new T1());

    //Example of Lamda expressions
    //Lamda expressions are used to implement functional interface
    //Functional interface is one where only 1 abstract method is present
    //Variable holding function -> functinal programming

//    Java Stream API (introduced in Java 8) is used to process collections of data in a declarative and functional style.
//    It provides operations such as filtering, mapping, reducing, and collecting.
//    It does not store data but instead performs computations on demand.
//    Streams support sequential and parallel execution.

//    Thread t3 = new Thread(() -> {
//        System.out.println(Thread.currentThread().getName());
//    });

    public static void main(String[] args) {
        Operation addOp = (a, b) -> a + b;
        System.out.println(addOp.operate(10, 20));



        //Predicate => functional interface which returns the boolean value
        //user to hold a condition
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(27));


        Predicate<String> startwithA = s -> s.startsWith("A");
        System.out.println(startwithA.test("Anika"));

        Predicate<String> endswithA = s -> s.endsWith("A");
        System.out.println(endswithA.test("Amisha"));

        System.out.println(startwithA.and(endswithA).test("Anushi"));   //false



        //function -> does something
        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(20));        //40

        Function<Integer, Integer> tripleIt = x -> x * 3;   //60
        System.out.println(tripleIt.apply(20));

        System.out.println(doubleIt.andThen(tripleIt).apply(20));      //120

        //Consumer -> It will consume & process the output, no return type results
        //for ex below, it takes an input & just print it no processing on it
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> consumer = x -> {
            for (int i = 0; i < x.size(); i++) {
                System.out.println(list.get(i));
            }
        };
        consumer.accept(list);


        //supplier -> it only returns the value, do not take any
        Supplier<String> print = () -> "Hello";
        System.out.println(print.get());


        //combined example
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Supplier<Integer> supplier = () -> 100;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Function<Integer, Integer> doubleIt2 = x -> x * x;

        if(isEven.test(supplier.get())) {
            consumer1.accept(doubleIt2.apply(supplier.get()));
        }

        //Method reference -> short cut than lamba function
        Consumer<Integer> printNow = x -> System.out.println(x);
        printNow = System.out::println;

        List<String> students = Arrays.asList("Vedangi", "Kiran");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);


        //constructor reference
        List<String> names = Arrays.asList("Vedangi", "Kiran");
        names.forEach(x -> new Phone(x));
        List<Phone> phones = names.stream().map(x -> new Phone(x)).collect(Collectors.toList());


    }


}

interface Operation {
    int operate(int a, int b);
}
class T1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Phone {
    String name;

    public Phone(String name) {
        this.name = name;
    }
}
