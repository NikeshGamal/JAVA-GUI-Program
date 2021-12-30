import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PositionExample extends JFrame implements MouseListener, MouseMotionListener {
       JButton t1,t2;
    public PositionExample(){
        setSize(550,450);

        t1=new JButton();
        t2=new JButton();

        add(t1);
        add(t2);

        addMouseListener(this);
        addMouseMotionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
      t1.setText("IN!!!");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        t1.setText("OUT!!!");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
       String s="X: "+e.getX()+"Y: "+e.getY();

       t2.setText(" "+s);
    }
}

public class MousePosition {
    public static void main(String [] args){
        new PositionExample();
    }
}
