import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon(new ImageIcon("load.png").getImage().getScaledInstance(16,16,Image.SCALE_SMOOTH));
        saveIcon = new ImageIcon(new ImageIcon("save.jpg").getImage().getScaledInstance(16,16,Image.SCALE_SMOOTH));
        exitIcon = new ImageIcon(new ImageIcon("exit.png").getImage().getScaledInstance(16,16,Image.SCALE_SMOOTH));

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        //-------------shortcuts------------
        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + F
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + E
        helpMenu.setMnemonic(KeyEvent.VK_H); // alt + H
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
        //----------------------------------

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar); // Instance of adding, we setting the menu bar
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loadItem){
            System.out.println("load");
        }
        else if(e.getSource() == saveItem){
            System.out.println("save");
        }
        else if (e.getSource() == exitItem) {
            System.exit(0);
        }


    }
}
