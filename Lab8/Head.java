import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * Write a description of class Head here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Head extends JPanel
{
    private   JCheckBox cb = new JCheckBox("Hat");
    /**
     * Constructor for objects of class Head
     */
    public Head(){
        this.setPreferredSize(new Dimension(500,1000));
        this.add(cb);
        class MyItemListener implements ItemListener {
            public void itemStateChanged(ItemEvent ie) {
                repaint();}}
        cb.addItemListener(new MyItemListener());
    }
        
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(new RoundRectangle2D.Double(150,150,200,300,10,15));//head
        g2.draw(new RoundRectangle2D.Double(175,200,50,10,10,15));//eye1
        g2.draw(new RoundRectangle2D.Double(275,200,50,10,10,15));//eye2
        g2.draw(new RoundRectangle2D.Double(250,250,10,30,10,15));//nose
        g2.draw(new RoundRectangle2D.Double(200,400,100,25,10,15));//mouth
        if (cb.isSelected()) {
            g2.draw(new RoundRectangle2D.Double(200,50,100,50,10,15));//head1
            g2.draw(new RoundRectangle2D.Double(50,100,400,50,10,15));}};//head2
            
    public static void main(String[] args) {
        JFrame f = new JFrame("frame");
        f.setLayout(new FlowLayout());
        f.add(new Head());
        f.pack();
        f.setVisible(true); }
}
