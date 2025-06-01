package ThreadExamples.ExecutorFramework;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Factorial factorial = new Factorial();
        Thread[] threads = new Thread[11];
        long startTime = System.currentTimeMillis();
        for(int i=1; i<=10; i++) {
            int finalI = i;
            threads[finalI] = new Thread(() -> {
                System.out.println(factorial.factorial(finalI));
            });
            threads[finalI].start();
        }

        for(int i=1; i<=10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Done: "+(System.currentTimeMillis() - startTime));
    }
}

class Factorial {
    Integer factorial(int n) {
        Integer fact = 1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
