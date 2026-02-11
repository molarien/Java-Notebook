import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"}; // Wrapper class kullanmalısın -> Integer, Double
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 1);  // kaydırma yaparak hedef indexe ekleme yapar, herhangi kayıp olmaz
        comboBox.setSelectedIndex(0);   // her defasında 0.indeks default olarak seçili olsun
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }

    }
}
