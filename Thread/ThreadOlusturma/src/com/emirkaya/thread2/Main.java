package com.emirkaya.thread2;

public class Main {

    public static void main(String[] args){


        // Burada ise anonim class yapısını kullanarak thread olusturduk.


        System.out.println("Main thread çalışıyor");


        Thread printer1 = new Thread(() -> {

            System.out.println("Thread çalışıyor");

            for (int i = 1 ; i<= 10; i++){
                try{
                    System.out.println("Yazıyor: " + i);
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println("Hata meydana geldi");
                }
            }

        });

        printer1.start();

    // buradaki ok işaretleri runnable intercafeinin kısaltımı
        


        new Thread(() -> {

            System.out.println("Thread çalışıyor");

            for (int i = 1 ; i<= 10; i++){
                try{
                    System.out.println("Yazıyor: " + i);
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println("Hata meydana geldi");
                }
            }

        }).start();

        // burada ise objemize referans deger vermediğimiz için
        // tek kullanımlık bir thread olusturduk.




    }



}
