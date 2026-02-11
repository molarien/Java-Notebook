import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;

    ImageIcon xIcon;
    ImageIcon checkIcon;

    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("src/x.jpg");
        checkIcon = new ImageIcon("src/check.png");

        Image imgX = xIcon.getImage();
        Image scaledImgX = imgX.getScaledInstance(20,20,Image.SCALE_SMOOTH);
        Image imgCheck = checkIcon.getImage();
        Image scaledImgCheck = imgCheck.getScaledInstance(20,20,Image.SCALE_SMOOTH);

        xIcon = new ImageIcon(scaledImgX);
        checkIcon = new ImageIcon(scaledImgCheck);

//------------------------Daha Kısa Tanımlama----------------------------------

//        xIcon = new ImageIcon(
//                new ImageIcon("src/x.jpg")
//                        .getImage()
//                        .getScaledInstance(14,14,Image.SCALE_SMOOTH)
//        );
//
//        checkIcon = new ImageIcon(
//                new ImageIcon("src/check.png")
//                        .getImage()
//                        .getScaledInstance(14,14,Image.SCALE_SMOOTH)
//        );

//-----------------------------------------------------------------------------

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("Gym");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN,20));
        checkBox.setIcon(xIcon);             // boşken görünecek resim
        checkBox.setSelectedIcon(checkIcon); // tıklayınca görünecek resim

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
    }
}
