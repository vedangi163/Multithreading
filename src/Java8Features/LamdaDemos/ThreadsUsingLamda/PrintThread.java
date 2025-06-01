package Java8Features.LamdaDemos.ThreadsUsingLamda;

//public class PrintThread implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(Thread.currentThread().getName() + " " + i);
//         }
//     }
//}


class Test {
    public static void main(String[] args) {
//        PrintThread pt = new PrintThread();
//        Thread t1 = new Thread(pt);
//
//        t1.start();


        //New way of using lamda expression

        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(" " + i);
            }
        };
        Thread t2 = new Thread(r);
        t2.start();
    }
}
