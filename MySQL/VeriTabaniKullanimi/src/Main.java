public class Main {
    public static void main(String[] args) {

        Baglanti baglanti = new Baglanti();

        baglanti.calisanlariGetir();

        System.out.println("---------------------------------------------");

        baglanti.calisanEkle();
        baglanti.calisanlariGetir();

        System.out.println("---------------------------------------------");

        baglanti.calisanGuncelle();
        baglanti.calisanlariGetir();

        System.out.println("---------------------------------------------");

        baglanti.calisanSil();
        baglanti.calisanlariGetir();


        System.out.println("---------------------------------------------");

        baglanti.preparedCalisanlariGetir(1);


        System.out.println("---------------------------------------------");

        baglanti.commitVeRollback();


    }
}
