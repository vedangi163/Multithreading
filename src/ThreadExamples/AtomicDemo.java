package ThreadExamples;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic is used to run the code in Thread safe manner
public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=3000; i++) {
                count.increament();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=3000; i++) {
                count.increament();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count:: "+count.getCount());
    }
}

class Count {
    //int count;
    AtomicInteger count = new AtomicInteger();
    void increament() {
        count.incrementAndGet();
    }

    int getCount() {
        return count.get();
    }
}
