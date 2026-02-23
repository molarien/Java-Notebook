import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel {


    private Image image;

    myPanel(){

        image = new ImageIcon(getClass().getResource("/image.jpg")).getImage();
        this.setPreferredSize(new Dimension(500,500));


    }



    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image,0,0, getWidth(), getHeight(), this);  // anlık olarak arka planın boyutunu ayarlıyoruz

        g2D.setPaint(Color.red);                   // renk
        g2D.setStroke(new BasicStroke(5));    // kalınlık
        g2D.drawLine(0,0,500,500);

        g2D.setPaint(Color.BLACK);
        g2D.drawRect(0,0,100,200);   // içi boş

        g2D.fillRect(100,100,100,200);  // içi dolu

        g2D.setPaint(Color.yellow);
        g2D.drawOval(0,0,100,100);  // çember

        g2D.fillOval(0,0,100,100);  // daire


        g2D.drawArc(0,0,100,100,0,180);
        g2D.fillArc(0,0,100,100,0,180);
        g2D.setPaint(Color.white);
        g2D.fillArc(0,0,100,100,180,180);


        g2D.setPaint(Color.red);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};

        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(yPoints,xPoints,3);

        g2D.setFont(new Font("Ink Free", Font.BOLD,50));
        g2D.drawString("Winner!",150,50);

    }


}
