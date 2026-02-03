import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {


    private Semaphore sem = new Semaphore(2);


    public void threadFonksiyonu(int id){

        try {
            sem.acquire();   // değişkenin değerini 1 azaltır

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Thread başlıyor.. ID: "+ id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread çıkıyor.. ID: "+ id);
        sem.release();       // değişkenin değerini 1 arttırır


    }


}
