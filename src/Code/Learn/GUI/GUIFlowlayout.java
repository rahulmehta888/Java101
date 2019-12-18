package Code.Learn.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFlowlayout extends JFrame {

    private JButton lb;
    private JButton rb;
    private JButton cb;
    private Container container;

    private FlowLayout layout;

    public GUIFlowlayout(){
        super("title");
        layout=new FlowLayout();
        container=getContentPane();
        setLayout(layout);

        lb= new JButton("Left");
        add(lb);
        lb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(getContentPane());
            }
        });

        rb= new JButton("Right");
        add(rb);
        rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(getContentPane());
            }
        });

        cb= new JButton("Center");
        add(cb);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(getContentPane());
            }
        });
    }

}
