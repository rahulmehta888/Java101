package Code.EventsHandler;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler extends JFrame
{
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JPasswordField jPasswordField;
    public EventHandler()
    {
        super("Expanded GUI");
        setLayout(new GridLayout(0,2,8,8));

        jTextField1=new JTextField(10);
        Font font = new Font("Courier", Font.BOLD,20);
        jTextField1.setFont(font);
        jTextField1.setSize(50,150);
        jTextField1.setHorizontalAlignment(JTextField.LEFT);
        add(jTextField1);

        jTextField2=new JTextField("Enter Text");
        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setSize(50,150);
        jTextField2.setFont(font);
        add(jTextField2);

        jTextField3=new JTextField("",20);
        jTextField3.setSize(50,150);
        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.setEditable(false);
        jTextField3.setFont(font);
        add(jTextField3);

        jPasswordField=new JPasswordField("password");
        jPasswordField.setSize(50,150);
        jPasswordField.setFont(font);
        jPasswordField.setHorizontalAlignment(JTextField.RIGHT);
        add(jPasswordField);
        thehandler handler=new thehandler();

        jTextField1.addActionListener(handler);
        jTextField2.addActionListener(handler);
        jTextField3.addActionListener(handler);
        jPasswordField.addActionListener(handler);

    }
    private class thehandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            String string="";
            if (e.getSource()==jTextField1)
            {
                string=String.format("Text Field 1: %s",e.getActionCommand());
            }
            else if (e.getSource()==jTextField2)
            {
                string=String.format("Text Field 2: %s",e.getActionCommand());
            }
            else if (e.getSource()==jTextField3)
            {
                string=String.format("Text Field 3: %s",e.getActionCommand());
            }
             else if (e.getSource()==jPasswordField)
            {
                string=String.format("Password Field : %s",e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,string);
        }
    }



}
