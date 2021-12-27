import javax.swing.*;
import java.awt.event.*;

class Example extends JFrame implements ActionListener{
    JButton plus,minus;
    JTextField t1,t2,result;
    public Example(){
        setSize(650,450);

        t1=new JTextField();
        t1.setBounds(300,30,50,30);

        t2=new JTextField();
        t2.setBounds(300,80,50,30);

        result=new JTextField();
        result.setBounds(300,120,50,30);

        plus=new JButton("ADD");
        plus.setBounds(50,300,90,30);

        minus=new JButton("Minus");
        minus.setBounds(400,300,90,30);

        add(t1);
        add(t2);
        add(result);
        add(plus);
        add(minus);

        plus.addActionListener(this);
        minus.addActionListener(this);

        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
          int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int add=n1+n2;
        int sub=n1-n2;

        if(e.getSource()==plus){
            result.setText(" "+add);
        }else if(e.getSource()==minus){
            result.setText(" "+sub);
        }
    }
}

public class ArithmeticOperation {
    public static void main(String [] args){
        new Example();
    }
}