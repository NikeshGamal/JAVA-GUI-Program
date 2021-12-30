import javax.swing.*;
import java.awt.event.*;

class WorkingExample extends JFrame implements ActionListener{
    JButton btn;
    JTextField t1;
   public WorkingExample(){
         setSize(550,450);

         t1=new JTextField();
         t1.setBounds(100,150,80,40);
         btn=new JButton("Submit");
         btn.setBounds(100,250,80,40);
         t1.setEditable(false);
         add(t1);
         add(btn);

         btn.addActionListener(this);
         setLayout(null);
         setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        t1.setText("Working");
    }
}

public class BasicProgram {
    public static void main(String [] args){
        new WorkingExample();
    }
}
