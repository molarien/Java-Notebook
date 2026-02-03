import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Thread çalışıyor");

                for(int i = 0 ; i < 100000000 ; i++){

                    if(Thread.currentThread().isInterrupted()){

                        System.out.println("Kesintiye uğradı");
                        return;

                    }
                    list.add(i);

                }

                System.out.println("Thread kesintiye uğramadı");

            }

        });


        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t.interrupt();  // thread'i 2 saniye sonra yarıda kesiyoruz


    }
}