package Code.Main;

import Code.LearnGUI.GUIComponents;

import javax.swing.*;
import javax.swing.JFrame;

public class Mainclass {
    public static void main(String[] args)
    {
        /*One.Static

        Static member1=new Static("first","last");
        Static member2=new Static("first","last");
        Static member3=new Static("first","last");
        System.out.println();
        System.out.println(member1.getFirstName());
        System.out.println(member1.getFirstName());
        System.out.println(member1.getMembers());
        System.out.println(Static.getMembers());
         */

        /* Two.Final

        Final f=new Final(10);
        for(int i =0; i<10;i++)
        {
            f.addNumber();
        }
        String a=String.valueOf(f);
        System.out.println(a);
        System.out.println(f);

         */

        /*
        InheritanceChildOne ChildOne=new InheritanceChildOne();
        InheritanceChildTwo ChildTwo= new InheritanceChildTwo();
        ChildOne.printsomething();
        ChildTwo.printsomething();

         */

         /*
         String FirstNumber = JOptionPane.showInputDialog("Enter First Number");
         String LastNumber = JOptionPane.showInputDialog("Enter Last Number");
         int number1 = Integer.parseInt(FirstNumber);
         int number2 = Integer.parseInt(LastNumber);
         int sum = number1 + number2;
         JOptionPane.showMessageDialog(null,"The Answer is " + sum,"title",JOptionPane.ERROR_MESSAGE);

         */

        GUIComponents Components= new GUIComponents();

        Components.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Components.setSize(2000,500);
        Components.setVisible(true);

    }
}
