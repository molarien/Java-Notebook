package com.emirkaya.thread2;

public class Main {
    public static void main(String[] args) {


        System.out.println("Main thread çalışıyor");


        Thread thread1 = new Thread(new Printer("printer1"));
        Thread thread2 = new Thread(new Printer("printer2"));



        thread1.start();
        thread2.start();


    }
}