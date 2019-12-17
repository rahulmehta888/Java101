package Code.Learn.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIList extends JFrame {
    private JList Left;
    private JList Right;
    private JButton move;
    private Font font=new Font("SansSerif",Font.PLAIN,30);
    private static String[] food={"Rajma","Chole","Kadi","Paneer","Bhindi"};

    public GUIList(){
        super("Title");
        setLayout(new FlowLayout());

        Left=new JList(food);
        Left.setVisibleRowCount(3);
        Left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Left.setFont(font);
        add(new JScrollPane(Left));
List list=new List();
list.add("ded");

ArrayList<String> s=new ArrayList<String>();
s.add("Dad");
s.add("Dad2");
s.remove("Dad");
s.forEach(
        a-> System.out.println(a)
);
        move=new JButton("Move -->");
        move.setFont(font);
        move.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Right.setListData(Left.getSelectedValues());
            }
        });
        add(move);

        Right=new JList();
        Right.setVisibleRowCount(3);
        Right.setFixedCellHeight(42);
        Right.setFixedCellWidth(100);
        Right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Right.setFont(font);
        add(new JScrollPane(Right));
    }
}