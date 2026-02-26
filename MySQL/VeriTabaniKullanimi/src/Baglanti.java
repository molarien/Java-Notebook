import java.sql.*;
import java.util.Scanner;

public class Baglanti {

    private String kullaniciAdi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;


    public Baglanti(){

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUniCode=true&characterEncoding=utf8";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");   // projeye eklediğimiz MySQL .jar kütüphanesini belleğe yükler

        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı");
        }

        try {
            con = DriverManager.getConnection(url,kullaniciAdi,parola);
            // belirlediğimiz url, kullanıcıadı, parola ile SQL-Java app. köprüsünü kurar

        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız");
        }

        System.out.println("Bağlantı başarılı");

    }



    public void preparedCalisanlariGetir(int id){

        String sorgu = "Select * From calisanlar where id > ? and ad like ?";


        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2,"S%");


            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Ad : " + ad + " Soyad : " + soyad +  " Email : "+ email);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }


    public void calisanEkle(){

        try {
            statement = con.createStatement();

            String ad  = "Semih";
            String soyad = "Kaya";
            String email = "semihkaya@gmail.com";

            String sorgu  = "Insert Into calisanlar (ad,soyad,email) VALUES(" + "'" + ad + "'" + "," + "'" + soyad + "'" + "," +  "'" + email + "')";


            statement.executeUpdate(sorgu);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void calisanGuncelle(){

        try {
            statement = con.createStatement();

            String sorgu = "Update calisanlar Set email = 'yenimail@gmail.com' where id = 1";

            statement.executeUpdate(sorgu);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public void calisanSil() {

        try {
            statement = con.createStatement();

            String sorgu = "Delete from calisanlar where id > 3";

            int deger = statement.executeUpdate(sorgu);

            System.out.println(deger + " kadar veri etkilendi..");




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void commitVeRollback(){
        Scanner scanner = new Scanner(System.in);

        try {
            con.setAutoCommit(false);

            String sorgu = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'updatemail@gmail.com' where id = 1";

            System.out.println("Güncellenmeden önce");

            calisanlariGetir();

            Statement statement = con.createStatement();

            statement.executeUpdate(sorgu);
            statement.executeUpdate(sorgu2);


            System.out.println("İşlemleriniz kayıt edilsin mi (yes/no)");
            String cevap = scanner.nextLine();

            if(cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabanı güncellendi");

            }
            else{

                con.rollback();
                System.out.println("Veritabanı güncellenmesi iptal edildi");
                calisanlariGetir();
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }







    public void calisanlariGetir(){

        String sorgu = "Select * From calisanlar";

        try {
            statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sorgu);

            while(rs.next()){

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("Id : "+ id + ", Ad : "+ ad + ", Soyad : " + soyad + ", Email : "+ email );

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }








}
