import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Write a description of class Adder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adder extends JPanel
{
    /**
     * Constructor for objects of class Adder
     */
    public Adder(){
        this.setPreferredSize(new Dimension(550,100));
        JTextField tf= new JTextField(10);
        JTextField tf2= new JTextField(10);
        JLabel l = new JLabel();
        JButton b = new JButton("Add");
        this.add(tf);this.add(tf2);this.add(l);this.add(b);
        class MyActionListener implements ActionListener {
            public void actionPerformed(ActionEvent ae){
                int result = Integer.parseInt(tf.getText()) + Integer.parseInt(tf2.getText());
                l.setText(result +"");
            }
        }
        b.addActionListener(new MyActionListener());
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setLayout(new GridLayout());
        f.add(new Adder());
        f.pack();
        f.setVisible(true); }
}