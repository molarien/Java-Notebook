import javax.swing.*;

public class NewWindow {

    public NewWindow(){

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label.setText("Hello");
        label.setBounds(0,0,50,10);
        label.setOpaque(true);
        frame.add(label);


        frame.setVisible(true);
    }




}
