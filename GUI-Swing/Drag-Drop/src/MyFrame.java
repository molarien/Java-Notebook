import javax.swing.*;

public class MyFrame extends JFrame {


    DragPanel dragPanel = new DragPanel();

    public MyFrame(){


        this.add(dragPanel);
        this.setTitle("Drag & Drop Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

}
