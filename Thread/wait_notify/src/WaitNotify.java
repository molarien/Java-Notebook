import java.util.Scanner;

public class WaitNotify {

    private Object lock = new Object();

    public void thread1Fonksiyonu(){

        synchronized (lock){

            System.out.println("Thread1 çalışıyor");
            System.out.println("Thread1 Thread2'nin kendisini uyandırmasını bekliyor");

            try {
                lock.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread1 uyandı devam ediyor");

        }

    }


    public void thread2Fonksiyonu(){

        Scanner scanner = new Scanner(System.in);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock){

            System.out.println("Thread2 çalışıyor, devam etmek için bir tuşa bas");

            scanner.nextLine();

            lock.notify();
            System.out.println("Thread1 i uyandırıyor Thread2");


        }

    }


}
