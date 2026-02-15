public class Main {

    private int count = 0;

    public synchronized void arttir(){

        count++;
    }

    // synchronized anahtar kelimesi, aynı anda sadece bir thread’in arttir()
    // metoduna girmesine izin verir.

    public void threadleriCalistir() {

            Thread thread1 = new Thread(new Runnable() {

                @Override
                public void run() {

                    for (int i = 0; i<500 ; i++){
                        arttir();
                    }
                }

            });


            Thread thread2 = new Thread(new Runnable() {

                @Override
                public void run() {

                    for (int i = 0; i<500 ; i++){
                        arttir();
                    }
                }

            });


            thread1.start();
            thread2.start();

            try {
            thread1.join();
                thread2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        // .join(); ile threadlerin çalışmalarını bitirip sonra alttaki printe geçmesini söyler


        System.out.println("Count: " + count);

    }


    public static void main(String[] args) {

        Main threadsafe = new Main();

        threadsafe.threadleriCalistir();


    }
}