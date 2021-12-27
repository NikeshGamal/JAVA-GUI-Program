import javax.swing.*;
import java.awt.event.*;

class Operation extends JFrame implements ActionListener{
    JTextArea t;
    JMenuBar bar;
    JMenu edit;
    JMenuItem cut,copy,paste,selectAll,close;

    public Operation(){
        setSize(550,450);

        bar=new JMenuBar();
        setJMenuBar(bar);

        t=new JTextArea();
        t.setBounds(150,50,350,250);

        edit=new JMenu("Edit");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectAll=new JMenuItem("SelectAll");
        close=new JMenuItem("Close");

        add(t);
        bar.add(edit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(new JSeparator());
        edit.add(close);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        close.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
         if(e.getSource()==cut){
             t.cut();
         }
        if(e.getSource()==copy){
            t.copy();
        }
        if(e.getSource()==paste){
            t.paste();
        }
        if(e.getSource()==selectAll){
            t.selectAll();
        }
        if(e.getSource()==close){
            System.exit(0);
        }
    }
}


public class MenuOperation {
    public static void main(String [] args){
          new Operation();
    }
}
