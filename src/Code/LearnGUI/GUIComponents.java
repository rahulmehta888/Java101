package Code.LearnGUI;

import javax.swing.*;
import java.awt.*;


public class GUIComponents extends JFrame
{
    private JLabel Label;
    private JLabel Label2;
    public GUIComponents()
    {
        super("Title Bar");
        setLayout(new FlowLayout());
        Label = new JLabel("A sentence");

        Label.setSize(2000,4000);
        Label.setVerticalAlignment(JLabel.BOTTOM);
        Label.setHorizontalTextPosition(JLabel.LEFT);
        int w=Label.getWidth();
        int h=Label.getHeight();
        Label2= new JLabel(w+" "+h);
        Label.setToolTipText("Tool-tip");
        add(Label);
        add(Label2);
    }


}
