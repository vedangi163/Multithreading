package ThreadExamples;


//race condition - when multiple threads trues to access shared resource then it leads to incorrect state called race condition
//mutual exclusion - a technique where shared resource is accessed by only one thread at a time
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();   // a shared resource accessed by 2 threads,
        Test t1 = new Test(counter);
        Test t2 = new Test(counter);

        t2.start();
        t1.start();

        t1.join();     //join() makes the calling thread Main thread wait until thread on which join() is called (t1) completes its execution
        t2.join();

        System.out.print("counter::::::::; "+counter.getCounter());     //without synchronized, t1 & t2 at same time increment the count to 1
    }
}


class Counter {
    int counter = 0;

    void increment() {
        synchronized (this) {
            counter++;
        }
    }

    int getCounter() {
        return counter;
    }
}

class Test extends Thread {
    Counter counter;

    Test(Counter counter) {
        this.counter = counter;
    }

    public void run() {
//        synchronized (counter) {
            for (int i=1; i<=3000; i++) {
                counter.increment();
            }
//        }
    }
}