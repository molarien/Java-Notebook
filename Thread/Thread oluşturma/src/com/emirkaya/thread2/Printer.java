package com.emirkaya.thread2;

public class Printer implements Runnable {

    private String name;


    public Printer(String name) {
        this.name = name;
    }


    @Override
    public void run() {

        System.out.println(name + " çalışıyor");


        for (int i = 1; i <= 10 ; i++){
            System.out.println(name + " yazıyor: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı");
            }

        }

        System.out.println(name + " işini bitirdi..." );

    }


}
