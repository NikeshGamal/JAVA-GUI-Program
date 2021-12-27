import javax.swing.*;
import java.awt.event.*;

class Popping extends JFrame implements MouseListener{
      JFrame f;
      JPopupMenu pop;
      JMenuItem cut,copy;
    public Popping(){
        f=new JFrame();
        f.setSize(550,450);
        f.setLayout(null);
        f.setVisible(true);

        pop=new JPopupMenu();

        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");

        pop.add(cut);
        pop.add(copy);

        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
         pop.show(f,e.getX(),e.getY());
   }
    public void mouseEntered(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
}

public class PopWindow {
    public static void main(String [] args){
       new Popping();
    }
}
