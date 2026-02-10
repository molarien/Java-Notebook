import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));    // FlowLayout.LEADING gibi parametre alabiliyor içine
                                              // LEADING -> sola yaslı
                                              // parametre vermeye de bilirsin

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new Button("   1   "));
        panel.add(new Button("   2   "));
        panel.add(new Button("   3   "));
        panel.add(new Button("   4   "));
        panel.add(new Button("   5   "));
        panel.add(new Button("   6   "));
        panel.add(new Button("   7   "));
        panel.add(new Button("   8   "));
        panel.add(new Button("   9   "));

        frame.add(panel);

        frame.setVisible(true);









    }
}