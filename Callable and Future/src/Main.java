import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);


        executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                System.out.println("Thread çalışıyor");

                int sure = random.nextInt(1000) + 2000;

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread çıkıyor..");

            }
        });



        // Runnable değer döndürmüyor bunun için Future ve Callable interfacelerini kullandık

        Future<Integer> future = executor.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                System.out.println("Thread çalışıyor");

                int sure = random.nextInt(1000) + 2000;

                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread çıkıyor..");

                return sure;
            }

        });

        executor.shutdown();

        try {

            System.out.println("Dönen değer: " + future.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}