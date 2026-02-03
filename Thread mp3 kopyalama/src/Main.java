import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku(){

        try {
            FileInputStream in = new FileInputStream("mp3_file_name.mp3");


            int oku;

            while((oku = in.read()) != -1){

                icerik.add(oku);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void kopyala(String dosyaAdi){

        try {
            FileOutputStream out = new FileOutputStream(dosyaAdi);

            for ( int deger : icerik){
                out.write(deger);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {

        dosyaOku();



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Copy 1.mp3");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Copy 2.mp3");
            }
        });


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Copy 3.mp3");
            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("Copy 4mp3");
            }
        });


        long baslangic = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        long bitis = System.currentTimeMillis();


        System.out.println("Dosyaların kopyalanma Süresi: " + (bitis - baslangic)/1000 + " saniye");
    }
}