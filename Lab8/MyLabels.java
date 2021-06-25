import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Write a description of class MyLabels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyLabels extends JPanel
{
    public MyLabels(){
        this.setPreferredSize(new Dimension(300,200));
        JLabel l = new JLabel();
        l.setText("One");
        l.setSize(200, 100);
        l.setBorder(BorderFactory.createEtchedBorder());
        JLabel l2 = new JLabel();
        l2.setText("Two");
        l2.setSize(200, 100);
        l2.setBorder(BorderFactory.createEtchedBorder());
        JLabel l3 = new JLabel();
        l3.setText("Three");
        l3.setSize(200, 100);
        l3.setBorder(BorderFactory.createEtchedBorder());
        this.add(l);this.add(l2);this.add(l3);
    }
        
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setLayout(new FlowLayout());
        f.add(new MyLabels());f.add(new MyLabels());f.add(new MyLabels());
        f.pack();
        f.setVisible(true); 
    }
}
