public class ThreadSafe {


    private int count = 0;


    public synchronized void up(){

        count++;
    }




    public void startThreads()  {


        Thread thread1 =new Thread(new Runnable(){


            @Override
            public void run() {
                for (int i = 0 ;  i < 5000; i++){
                    up();
                }
            }
        });



        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ;  i < 5000; i++){
                    up();
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


        System.out.println("Count değeri: " + count);



    }




    public static void main(String[] args) {


        ThreadSafe threadSafe = new ThreadSafe();

        threadSafe.startThreads();




    }






}