package Code.Learn.GUI;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class GUIMouse extends JFrame {
private JPanel mouse;
private JLabel statusbar;

public GUIMouse()
{
    mouse=new JPanel();
    mouse.setBackground(Color.WHITE);
    add(mouse,BorderLayout.CENTER);

    statusbar=new JLabel("default");
    add(statusbar, BorderLayout.SOUTH);

    MouseHandler handler=new MouseHandler();
    mouse.addMouseListener(handler);
    mouse.addMouseMotionListener(handler);



}
    private class MouseHandler implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusbar.setText(String.format("CLicked at %d, %d",e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusbar.setText("You pressed the mouse");

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusbar.setText("You released the mouse");

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusbar.setText("You are in the pane");
            mouse.setBackground(Color.BLUE);

        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusbar.setText("You have exited the pane");
            mouse.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {

            statusbar.setText("you are a drag");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusbar.setText("Caught you moving the mouse");
        }
    }

}
