import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        ImageIcon image = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);  // çerçeve oluşturur

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        label.setText("Bedava reklam olmaz");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);  // LEFT,CENTER, RIGHT ->  yazının resme göre konumu
        label.setVerticalTextPosition(JLabel.TOP); // TOP,CENTER,BOTTOM -> yazının resme göre konumu
        label.setForeground(new Color(0,255,150));
        label.setFont(new Font("Arial", Font.PLAIN, 50));
        label.setIconTextGap(-70);       // resim ile yazı arasındaki boşluğu ayarlar
        label.setBackground(Color.BLACK);  // arka plan rengini ayarlar
        label.setOpaque(true);    // arkaplan rengini görünür kılar
        label.setBorder(border);  // çerçeveyi ekler
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);           // icon + text  pozisyonunu ayarlar
        //label.setBounds(480,0,1000,1000);  // labelı kısıtlar ve konumu ayarlar



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        frame.setVisible(true);
        //frame.setLayout(null); // layout manager'i kapatır. Yani pencerenin boyutunu değiştirdiğinde kendi ayarlamayacak artık

        frame.add(label);
        frame.pack(); // pencereyi label'a göre ayarlar









    }
}