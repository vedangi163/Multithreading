package ThreadExamples.ExecutorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Callable<Integer> c1 = () -> {
            Thread.sleep(100000);
            System.out.println("Callable 1");
            return 1;
        };
        Callable<Integer> c2 = () -> {
            Thread.sleep(10999900);
            System.out.println("Callable 2");
            return 2;
        };
        Callable<Integer> c3 = () -> {
            Thread.sleep(1000);
            System.out.println("Callable 3");
            return 3;
        };

        List<Callable<Integer>> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);


        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        List<Future<Integer>> flist = executorService.invokeAll(list);
//
//        for(Future<Integer> future: flist) {
//            System.out.println(future.get());
//        }

        Integer res = executorService.invokeAny(list);
        System.out.println("res: "+res);

        System.out.println("Done");

    }
}
