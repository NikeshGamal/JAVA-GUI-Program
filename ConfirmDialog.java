import javax.swing.*;
import java.awt.event.*;

class WindowExample extends JFrame implements WindowListener{
    public WindowExample(){

        setSize(550,450);

        setLayout(null);
        setVisible(true);

        addWindowListener(this);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
       int res=JOptionPane.showConfirmDialog(this,"Are you sure?");

       if(res==JOptionPane.YES_OPTION){
           System.exit(0);
       }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Acticvated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
}

public class ConfirmDialog {
    public static void main(String [] args){
        new WindowExample();
    }
}
