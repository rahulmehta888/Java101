package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUIRadioButton extends JFrame
{
   private JTextField tf;

   private JRadioButton itb;
   private JRadioButton bb;
   private JRadioButton pb;
   private JRadioButton bib;

   private ButtonGroup bg;

   private Font itf;
   private Font bf;
   private Font pf;
   private Font bif;

   public GUIRadioButton()
   {
       super("Title");
       setLayout(new FlowLayout());
       tf= new JTextField("Wohooo chahe koi mujhe junglee kahe Kehne ko ji kehta rahe hum pyaar ke toffaano mein ghire hain");

        tf.setColumns(tf.getText().length()/2 + 10);
        add(tf);

       itf=new Font("Serif", Font.ITALIC,14);
       bf=new Font("Serif", Font.BOLD,14);
       pf=new Font("Serif", Font.PLAIN,14);
       bif=new Font("Serif", Font.ITALIC+Font.BOLD,14);

       itb=new JRadioButton("Italic");
       itb.setFont(itf);
       add(itb);

       bb=new JRadioButton("Bold");
       bb.setFont(bf);
       add(bb);

       pb=new JRadioButton("Plain");
       pb.setFont(pf);
      add(pb);

       bib=new JRadioButton("Italic + Bold");
       bib.setFont(bif);
       add(bib);

       bg=new ButtonGroup();
       bg.add(itb);
       bg.add(bb);
       bg.add(pb);
       bg.add(bib);

       itb.addItemListener(new handler(itf));
       bb.addItemListener(new handler(bf));
       pb.addItemListener(new handler(pf));
       bib.addItemListener(new handler(bif));


   }
   private class handler implements ItemListener{
       Font font;
       public handler(Font f)
       {
           this.font=f;
       }
       @Override
       public void itemStateChanged(ItemEvent e)
       {
           tf.setFont(font);
       }
   }
}
