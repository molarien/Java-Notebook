import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;

    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);


    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked te mouse"); // mouse'a basıp bıraktıktan sonra çalışır
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed te mouse"); // mouse'a basıtığın anda çalışır
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse"); // mouse'a tıklamayı bırakınca
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the mouse"); // mouse ile üzerine gelince
        label.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the mouse"); // mouse ile üzerinden gidince
        label.setBackground(Color.BLACK);
    }
}
