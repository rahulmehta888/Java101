package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;

public class GUIRadioButton extends JFrame
{
   private JTextField tf;
   private JRadioButton itb;
   private JRadioButton bb;
   private JRadioButton pb;
   private JRadioButton bib;
   private Font itf;
   private Font bf;
   private Font pf;
   private Font bif;

   public GUIRadioButton()
   {
       super("Title");
       setLayout(new FlowLayout());
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

   }
}
