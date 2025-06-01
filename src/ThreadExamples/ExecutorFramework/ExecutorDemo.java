package ThreadExamples.ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Factorial factorial = new Factorial();
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i=1; i<=9; i++) {
            int finalI = i;
            Future<Integer> future = executorService.submit(() -> {
                Integer n = factorial.factorial(finalI);
                System.out.println(n);
                return n;
            });
            futureList.add(future);
        }
        executorService.shutdown();

        for (Future<Integer> future: futureList) {
            System.out.println(future.get());
        }
//        executorService.submit(() -> 3453);
//        cannot use executorServiceonce its shutdown, thought all threads present in it may
//        still running

//        try {
//            executorService.awaitTermination(3, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Done at: "+(System.currentTimeMillis() - startTime));

    }
}
