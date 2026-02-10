import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Virüs Var!", "Windows", JOptionPane.PLAIN_MESSAGE);
                                    // parentComponent      message               title          Type of message
                                    //      |
                                    //      |
               // hangi componentin ortasında gözükeceğini belirler


        JOptionPane.showMessageDialog(null, "Virüs Var!", "Windows", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Virüs Var!", "Windows", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Virüs Var!", "Windows", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Virüs Var!", "Windows", JOptionPane.ERROR_MESSAGE);


        JOptionPane.showConfirmDialog(null, "Virüsü Temizlemek İstiyor Musun?", "Windows", JOptionPane.YES_NO_CANCEL_OPTION);

        int answer = JOptionPane.showConfirmDialog(null, "Virüsü Temizlemek İstiyor Musun?", "Windows", JOptionPane.YES_NO_CANCEL_OPTION);

        System.out.println(answer);

        // yes ---->  0
        // no ----->  1
        // cancel ->  2

        String name = JOptionPane.showInputDialog("Adın ne?");
        System.out.println("Merhaba, " + name);

        String[] responses = {"No, you are awesome", "thankss", "blash"};
        ImageIcon icon = new ImageIcon("src/smile.png");
        ImageIcon smallIcon = new ImageIcon(icon.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));

        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                smallIcon ,
                responses,
                0);


    }
}