class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread B: " + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.start();
        t1.join();   // Thread B waits for Thread A
        t2.start();
    }
}
/*
Thread A: 1
Thread A: 2
Thread A: 3
Thread A: 4
Thread A: 5
Thread B: 1
Thread B: 2
Thread B: 3
Thread B: 4
Thread B: 5

*/
