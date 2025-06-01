package ThreadExamples;

//volatile reads the value from memory i.e. RAM instead of reading it from Thread cache
//but volatile also has some limitations like cannot be used where there is lot of computations
// are there or take example of incrementing the count
public class VolatileDemo {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();
        Thread reader = new Thread(() -> obj.printIfTrue());
        Thread writer = new Thread(() -> obj.setFlagToTrue());

        writer.start();
        reader.start();
    }
}

class SharedObj {
    volatile boolean flag = false;

    public void setFlagToTrue() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        flag = true;
        System.out.println("Flag set to true");
    }

    public void printIfTrue() {
        while (!flag) {
            //do nothing
        }
        System.out.println("Flag is true !");
    }
}

