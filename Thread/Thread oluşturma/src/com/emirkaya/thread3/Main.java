package com.emirkaya.thread3;

public class Main {
    public static void main(String[] args) {


        System.out.println("Main thread çalışıyor");


        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread Çalışıyor");

                String name = "Printer1";

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

        });


        thread.start();




        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Thread Çalışıyor");

                String name = "Printer2";

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

        }).start();









    }
}