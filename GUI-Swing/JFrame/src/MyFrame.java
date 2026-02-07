import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("MyFrame");
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420,720);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("avşen logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(155, 35, 163));

    }

}
