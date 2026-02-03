import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku() {
        try (FileInputStream in = new FileInputStream("Yeni Metin Belgesi.txt")) {

            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void kopyala(String dosyaAdi) {
        try (FileOutputStream out = new FileOutputStream(dosyaAdi)) {

            for (int deger : icerik) {
                out.write(deger);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        dosyaOku();
        long baslangic = System.currentTimeMillis();

        kopyala("dosya.doc");


        long bitis = System.currentTimeMillis();

        System.out.println("Dosyaların kopyalanma Süresi: " + (bitis - baslangic) / 1000 + " saniye");
    }
}