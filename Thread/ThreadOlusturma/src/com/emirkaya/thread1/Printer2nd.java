package com.emirkaya.thread1;

public class Printer2nd implements Runnable {


    private String isim;

    public Printer2nd(String isim) {
        this.isim = isim;
    }



    @Override
    public void run() {
        System.out.println( isim + " Çalışıyor");

        for (int i = 1; i <= 10 ; i++){

            try {

                System.out.println(isim + " Yazıyor : " + i);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı");
            }


        }
        System.out.println( isim + " işini bitirdi");
    }






}
