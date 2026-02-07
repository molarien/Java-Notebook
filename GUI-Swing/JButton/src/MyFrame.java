import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    public MyFrame(){


        ImageIcon icon = new ImageIcon("src\\image.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(250,300,200,150);
        label.setVisible(false);


        button = new JButton();
        button.setText("I m a button");
        button.setBounds(200,100,480,150);
        button.addActionListener(this);
        button.setFocusable(false);  // focus çizgisini kapatır, göze daha güzel gelmesi için
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(15);
        button.setForeground(Color.red);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder()); // butona çerçeve ekler örneğin 3D efekti yapıyor bu şekilde

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){

            System.out.println("button activated..");

            button.setEnabled(false);  // butonun aktifliğini false yaptık

            label.setVisible(true);

        }
    }


}
