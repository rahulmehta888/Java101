package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

public class GUIButtons extends JFrame
{
    private JButton reg;
    private JButton Custom;

   public GUIButtons()
    {
        super("Something Cool");
        setLayout(new FlowLayout());
        reg=new JButton("Regular Button");
        add(reg);

        ImageIcon Image= new ImageIcon("C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_gandikota-grand_canyon_of_india.png");
        ImageIcon Image2= new ImageIcon("C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_avalanche_ooty.png");
        /*
        Icon icon=new ImageIcon(getClass().getResource("C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_avalanche_ooty.png"));

        Icon icon2=new ImageIcon(getClass().getResource("C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_gandikota-grand_canyon_of_india.png"));
*/

        Custom =new JButton("Custom",Image2);
        Custom.setRolloverIcon(Image);
add(Custom);

        HandlerClass handler= new HandlerClass();
        reg.addActionListener(handler);
        Custom.addActionListener(handler);

    }



}
class HandlerClass implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null,String.format("Happened at = %s and parameter are %s and Source is %s",e.getActionCommand(),e.paramString(),e.getSource()));
    }
}
