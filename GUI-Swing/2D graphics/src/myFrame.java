import javax.swing.*;

public class myFrame extends JFrame {

    myPanel panel;


    public myFrame(){

        panel = new myPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);  // Frame'i ekranın ortasında gösterir
        this.setVisible(true);

    }









}
