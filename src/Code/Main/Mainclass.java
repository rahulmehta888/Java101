package Code.Main;

import Code.Learn.Polymorphism.BingeEater;
import Code.Learn.Polymorphism.Rajma;
import Code.Learn.Polymorphism.Chole;
import Code.Learn.Polymorphism.food;

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
        food fd=new Rajma();
        food od=new food();
        BingeEater bingeEater = new BingeEater();
        bingeEater.digest(fd);
        bingeEater.digest(od);

    }
}
