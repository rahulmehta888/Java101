package Code.EventsHandler;
import javax.swing.*;
import java.awt.*;

public class Handler extends JFrame
{
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JPasswordField jPasswordField;
    public Handler()
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

    }


}
