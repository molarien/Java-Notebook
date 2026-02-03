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
        long baslangic = System.currentTimeMillis();

        kopyala("Copy 1.mp3");
        kopyala("Copy 2.mp3");
        kopyala("Copy 3.mp3");
        kopyala("Copy 4.mp3");

        long bitis = System.currentTimeMillis();

        System.out.println("Dosyaların kopyalanma Süresi: " + (bitis - baslangic)/1000 + " saniye");
    }
}