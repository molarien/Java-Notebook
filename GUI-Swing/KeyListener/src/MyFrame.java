import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    public MyFrame(){

        icon = new ImageIcon(new ImageIcon("rocket.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);


    }


    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()){

            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;

            case  'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;

            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;

            case 'd':
                label.setLocation(label.getX()+10,label.getY());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()){

            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;

            case  38:
                label.setLocation(label.getX(), label.getY()-10);
                break;

            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;

            case 39:
                label.setLocation(label.getX()+10,label.getY());
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("You released key char: "+ e.getKeyChar()); // hangi sembole basıldıgını dondurur
        System.out.println("You released key code: "+ e.getKeyCode()); // basılan bir tuşun Java’daki sanal tuş kodunu (virtual key code) döndürür.

    }

}
