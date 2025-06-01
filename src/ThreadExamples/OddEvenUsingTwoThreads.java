package ThreadExamples;
//in synchronizedDemo file, both threads are increasing the counter value which is of calling same method increament()
// but here, 2 threads need to print odd & even which is of different behaviour hence we created 2 classes extending Thread class


// V.V.V. IMP => wait() & notify() must be used with synchronized keyword
//synchronized {} block always used with shared resource, synchronized(test) { } test is shared resource

//Inter thread communication
public class OddEvenUsingTwoThreads {
    public static void main(String[] args) {
        Resourse count = new Resourse();

        OddThread t1 = new OddThread(count);
        EvenThread t2 = new EvenThread(count);

        t1.start();
        t2.start();
    }
}

class Resourse {
    int counter = 1;       //here, counter is a shared resource
    public synchronized void printOdd()  {
        while (counter<=10) {
            if(counter%2 == 0) {
                try {
                    wait();                 //since no is not odd so we will say that OddThread plz wait for sometime & let EvenThread print the even no
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Odd: "+counter);
            counter++;
            notify();
        }
    }

    public synchronized void printEven() {
        while (counter<=10){
            if (counter%2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Even: "+counter);
            counter++;
            notify();   //when OddThread is waiting as number is even hence this print number & notifies the OddThread that I m done so plz continue now
                        // its like notifying the other thread to start the execution & come out of its wait state
        }
    }
}

class OddThread extends Thread{
    Resourse resourse;

    OddThread(Resourse test) {
        this.resourse = test;
    }
    public void run() {
//        synchronized (test) {
            resourse.printOdd();
//        }

    }
}

class EvenThread extends Thread{
    Resourse resourse;

    EvenThread(Resourse test) {
        this.resourse = test;
    }
    public void run(){
//        synchronized (test) {
        resourse.printEven();
//        }
    }
}


