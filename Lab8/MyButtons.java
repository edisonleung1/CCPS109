import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MyButtons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyButtons extends JPanel
{

    /**
     * Constructor for objects of class MyButtons
     */
    public MyButtons(){
        this.setPreferredSize(new Dimension(250,100));
        JButton b = new JButton("Red");
        JButton b2 = new JButton("Green");
        JButton b3 = new JButton("Blue");
        this.add(b);this.add(b2);this.add(b3);
        class MyActionListener implements ActionListener {
            private Color c;
            public MyActionListener(Color c) { this.c = c; }
            public void actionPerformed(ActionEvent ae){
                setBackground(c);}
        }
        b.addActionListener(new MyActionListener(Color.RED));
        b2.addActionListener(new MyActionListener(Color.GREEN));
        b3.addActionListener(new MyActionListener(Color.BLUE));
    }
        
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setLayout(new GridLayout());
        f.add(new MyButtons());f.add(new MyButtons());
        f.pack();
        f.setVisible(true); }
}
