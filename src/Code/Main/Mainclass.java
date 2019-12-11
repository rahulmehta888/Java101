package Code.Main;

import Code.Learn.Abstract.Potpie;
import Code.Learn.Abstract.food;
import Code.Learn.Abstract.tuna;
import Code.Learn.GUI.GUIButtons;
import Code.Learn.GUI.GUICheckbox;
import Code.Learn.GUI.GUIComboBOx;
import Code.Learn.GUI.GUIRadioButton;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.util.function.Consumer;

public class Mainclass {
    public static void main(String[] args)
    {
        /*LearnStatic

        Static member1=new Static("first","last");
        Static member2=new Static("first","last");
        Static member3=new Static("first","last");
        System.out.println();
        System.out.println(member1.getFirstName());
        System.out.println(member1.getFirstName());
        System.out.println(member1.getMembers());
        System.out.println(Static.getMembers());
         */

        /* LearnFinalVariable

        Final f=new Final(10);
        for(int i =0; i<10;i++)
        {
            f.addNumber();
        }
        String a=String.valueOf(f);
        System.out.println(a);
        System.out.println(f);

         */

        /* LearnInheritance
        InheritanceChildOne ChildOne=new InheritanceChildOne();
        InheritanceChildTwo ChildTwo= new InheritanceChildTwo();
        ChildOne.printsomething();
        ChildTwo.printsomething();

         */

         /* LearnGUI
         String FirstNumber = JOptionPane.showInputDialog("Enter First Number");
         String LastNumber = JOptionPane.showInputDialog("Enter Last Number");
         int number1 = Integer.parseInt(FirstNumber);
         int number2 = Integer.parseInt(LastNumber);
         int sum = number1 + number2;
         JOptionPane.showMessageDialog(null,"The Answer is " + sum,"title",JOptionPane.ERROR_MESSAGE);

         */

         /*LearnGUI
        GUIComponents Components= new GUIComponents();

        Components.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Components.setSize(2000,500);
        Components.setVisible(true);

          */

         /* EventHandler
        EventHandler handler=new EventHandler();
        handler.setSize(1000,2000);
        handler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        handler.setVisible(true);

          */

/* Polymorphism first
         food[] polymorphedArray= new food[2];
         polymorphedArray[0]=new Rajma();
         polymorphedArray[1] = new Chole();

         for(food p:polymorphedArray)
         {
             p.eat();
         }
 */

/* Polymorphism
        food fd=new Rajma();
        food od=new food();
        BingeEater bingeEater = new BingeEater();
        bingeEater.digest(fd);
        bingeEater.digest(od);

 */

/* Abstract Class
food t=new tuna();
t.eat();
food p=new Potpie();
p.eat();

 */
/*
        GUIButtons guiButtons=new GUIButtons();
        guiButtons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiButtons.setSize(800,800);
        guiButtons.setVisible(true);

 */

/* CheckBox
        GUICheckbox guiCheckbox = new GUICheckbox();
        guiCheckbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiCheckbox.setSize(1000,1000);
        guiCheckbox.setVisible(true);

 */
/* RadioButton
        GUIRadioButton guiRadioButton = new GUIRadioButton();
        guiRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiRadioButton.setSize(700,700);
        guiRadioButton.setVisible(true);

 */

        GUIComboBOx guiComboBOx=new GUIComboBOx();
        guiComboBOx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiComboBOx.setSize(800,800);
        guiComboBOx.setVisible(true);
    }
}
