import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){

            JFileChooser fileChooser = new JFileChooser();

            // fileChooser.setCurrentDirectory(new File(".")); // direkt olarak dosyanın bulunduğu dizini açar
            fileChooser.setCurrentDirectory(new File("C:\\Users\\VICTUS\\Desktop")); // belirlediğimiz dizini default yapar


            // int response = fileChooser.showOpenDialog(null);    // select file to open
                                                                   // geçerli bi dosya seçerse -> 0
                                                                   // yoksa -> 1

            int response = fileChooser.showSaveDialog(null);  // dosyayı daha sonra oluşturman gerekli

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }


        }

    }
}
