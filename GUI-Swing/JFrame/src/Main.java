import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setVisible(true);

        frame.setSize(420,420);

        frame.setTitle("JFrame Title");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pencere kapanırsa program da kapanır

//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // default hali budur ve çarpıya basınca pencere kapanır ancak program arkada çalışmaya devam eder

//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // programda çarpıuya bastığında program hala çalışır ve pencere kapanmaz


        frame.setResizable(true);

        ImageIcon image = new ImageIcon("avşen logo.png");
        frame.setIconImage(image.getImage());
        // dosya dizinin içine png olarak resim attık ImageIcon nesnesi oluşturduk ve
        // pencerenin solunda gözüken java logosunu değiştirdik

        frame.getContentPane().setBackground(Color.CYAN);
        frame.getContentPane().setBackground(new Color(0,100,0));
        // arka plan rengini ayarladık RGB kullanarak
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
        // arka plan rengini hexidecimal ile ayarladık



        new MyFrame();






    }
}