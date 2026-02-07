import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);  // x,y eksenlerini sol üste göre hesaplıyor

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout()); // labelların sola yaslı olmasını sağlar
        // setLayout = null kullanıcaksan eğer label.setBounds() ile koord. ayarlaman lazım

        ImageIcon image = new ImageIcon("image.png");


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP);  // label'ı bulunduğu containerin en üst noktasına sıfırlar
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,250,250);
        bluePanel.add(label);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);





    }
}