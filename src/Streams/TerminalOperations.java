package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 45, 20));

        //1. count
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        //2. collect
        System.out.println(numbers.stream().collect(Collectors.toList()));


        //3.foreach
        numbers.stream().forEach(x -> System.out.println(x));

        //4. reduce -> reduce to single element
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(sum.get());

        //5. anyMatch, allMatch, noneMatch
        System.out.println(numbers.stream().anyMatch(x ->  x % 2 == 0));         //if any match found, at least 1 element which is even
        System.out.println(numbers.stream().allMatch(x -> x % 2 == 0));          //true if all matches predicate (all are even)
        System.out.println(numbers.stream().noneMatch(x -> x % 2 == 0));         //true if no element matches condition, all are odd

        //6. findFirst, findAny
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        //7. min & max
        System.out.println("Max   "+ numbers.stream().max((a, b) -> a.compareTo(b)));
        System.out.println("Min   "+ numbers.stream().min((a, b) -> a.compareTo(b)));

        //8. flatmap => flatten the collection
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );

        System.out.println("UpperCASE: "+listOfLists.stream().flatMap(x -> x.stream()).map(x -> x.toUpperCase()).collect(Collectors.toList()));


        List<String> sentences = Arrays.asList(
                "apple banana",
                "orang kiwi",
                "pear grape"
        );

        System.out.println(sentences.stream().flatMap(x -> Arrays.stream(x.split(" ")))
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList()));

        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        //Len > 3
        System.out.println(names.stream().filter(x -> x.length() > 3).collect(Collectors.toList()));

        //square & sort numbers
        System.out.println(numbers.stream().map(x -> x * x).sorted().collect(Collectors.toList()));

        //summing values
        System.out.println(numbers.stream().reduce((a, b) -> a + b).get());

        //count the occurance of char in String
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        names.stream().filter(x -> {
                    System.out.println(x);
                    return x.length() > 3;
                }).collect(Collectors.toList());


        //convert List to Map
        List<Employee> employeeList = Arrays.asList(
                new Employee(10, "Vedangi", 10000),
                new Employee(20, "Pooha", 12000),
                new Employee(100, "Poona", 12000),
                new Employee(50, "Pooka", 12000)
        );

        System.out.println(employeeList.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName())));

        //Collectors ==========
        //groupingBy
        System.out.println(names.stream().collect(Collectors.groupingBy(x -> x.length())));

        //partioningBy
        System.out.println(names.stream().collect(Collectors.partitioningBy(x -> x.length() % 2 == 0)));



    }
}


class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
