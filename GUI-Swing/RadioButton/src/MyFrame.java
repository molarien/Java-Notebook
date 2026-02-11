import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;


    public MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ImageIcon pizzaIcon = new ImageIcon("pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("hamburger.png");
        ImageIcon hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        ButtonGroup group = new ButtonGroup();   // butonlardan yalnız birisini seçmemize izin veriyor
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == pizzaButton){
            System.out.println("You ordered pizza");
        }
        else if(e.getSource() == hamburgerButton){
            System.out.println("You ordered hamburger");
        }
        else if(e.getSource() == hotdogButton){
            System.out.println("You ordered hotdog");
        }

    }
}
