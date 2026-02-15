package com.emirkaya.thread1;

public class Main {

    public static void main(String[] args){

        System.out.println("Main thread çalışıyor");

        Printer printer1 = new Printer("Printer1");
        Printer printer2 = new Printer("Printer2");

        // Thread ten miras alarak bir class olusturduk.


        printer1.start();
        printer2.start();


        Thread printer3 = new Thread(new Printer2nd("Printer3"));
        Thread printer4 = new Thread(new Printer2nd("Printer4"));

        // burada runnable interfaceini implemete edip Threadımızı
        // main metodunun içerisinde oluşturduk.
        // Thread() yapısı içerisine yapacağı işlemi bekliyor bu yüzden
        // Printer2nd classımızı içerisine attık.

        printer3.start();
        printer4.start();




    }






}
