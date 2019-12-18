package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;

public class GUIDraw extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);

        g.setColor(Color.black);
        g.drawRect(25,25,100,30);

        g.setColor(new Color(145,169,100));
        g.drawRect(25,80,100,30);

        g.setColor(Color.RED);
        g.drawString("Blah",25,150);


    }
}
