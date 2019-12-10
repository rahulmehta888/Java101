package Code.Learn.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICheckbox extends JFrame {
    private JTextField TF;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public GUICheckbox()
    {
        super("Some Title");
        setLayout(new FlowLayout());
        TF = new JTextField("Mera Naam Joker", 20);
        TF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        add(TF);

        boldbox = new JCheckBox("Bold Check Box");

        italicbox = new JCheckBox("Italic Check Box");

        add(boldbox);
        add(italicbox);

        Handle handler = new Handle();
        boldbox.addActionListener(handler);
        italicbox.addActionListener(handler);
    }

    class Handle implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            if (italicbox.isSelected() && boldbox.isSelected())
            {
                TF.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 14));
            }
            else if (italicbox.isSelected()) {
                TF.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 14));
            }
            else if (boldbox.isSelected()) {
                TF.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            }
            else {
                TF.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            }
        }
    }
}