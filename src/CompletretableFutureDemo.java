import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletretableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "worker Done";
        });
        System.out.println("Main thread");

        String result = completableFuture.get();
        System.out.println("Result: " + result);


        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "World");

        System.out.println(f1.thenCombine(f2, (a, b) -> a + b).get());


    }
}





