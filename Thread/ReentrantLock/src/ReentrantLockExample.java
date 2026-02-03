import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private int num = 0;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void up() {
        for (int i = 0; i < 10000; i++) {
            num++;
        }
    }

    public void thread1Function() {
        lock.lock();
        try {
            System.out.println("Thread1 çalışıyor");
            System.out.println("Thread1 uyandırılmayı bekliyor");

            condition.await();

            System.out.println("Thread1 uyandırıldı ve işleme devam ediyor");
            up();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void thread2Function() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);

        lock.lock();
        try {
            System.out.println("Thread 2 çalışıyor");
            up();
            System.out.println("Devam etmek için bir tuşa bas");
            scanner.nextLine();

            condition.signal();
            System.out.println("Thread 1'i uyandırdım");
        } finally {
            lock.unlock();
        }
    }

    public void threadOver() {
        System.out.println("Num değişkenin değeri: " + num);
    }
}
