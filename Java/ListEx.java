import java.awt.*;
import java.awt.event.*;

public class ListEx {
    public static void main(String args[]) {
        Frame f = new Frame();
        List l = new List(5);
        l.setBounds(100, 100, 150, 150);
        l.add("item1");
        l.add("item2");
        l.add("item3");
        l.add("item4");
        l.add("item5");
        f.add(l);
        
        Button b = new Button("Delete");
        b.setBounds(300, 300, 80, 30);
        f.add(b);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data = l.getItem(l.getSelectedIndex());
                l.remove(data);
            }
        });
    }
}
