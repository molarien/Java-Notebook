public class Main {

    public static void main(String[] args) {

        ReentrantLockExample example = new ReentrantLockExample();

        Thread t1 = new Thread(() -> {
            example.thread1Function();
        });

        Thread t2 = new Thread(() -> {
            example.thread2Function();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        example.threadOver();
    }
}