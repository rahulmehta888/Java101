package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUIComboBOx extends JFrame
{

    private JComboBox box;
    private JLabel picture;

    private static String[] filename ={"C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_avalanche_ooty.png","C:\\Users\\pmehta\\Java2911\\src\\image\\rsz_pawan_gandikota-grand_canyon_of_india.png"};
    private ImageIcon[] pics ={new ImageIcon(filename[0]), new ImageIcon(filename[1])};

    public GUIComboBOx(){
        super("Title");
        setLayout(new FlowLayout());
        picture= new JLabel(pics[0]);
        //picture.setIcon(pics[0]);
        box= new JComboBox(filename);
        add(box);
        add(picture);

         Handler2 handler= new Handler2();
         box.addItemListener(handler);



    }

    class Handler2 implements ItemListener
    {


        @Override
        public void itemStateChanged(ItemEvent e)
        {
            int i=box.getSelectedIndex();
            picture.setIcon(pics[i]);
        }
    }

}
