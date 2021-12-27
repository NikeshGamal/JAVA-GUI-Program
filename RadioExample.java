import javax.swing.*;
import java.awt.event.*;

class RadioButtonExample extends JFrame implements ActionListener{
    JLabel l;
    JRadioButton male,female;
    JButton btn;

    public RadioButtonExample(){
        setSize(550,450);
        setLayout(null);
        setVisible(true);

        l=new JLabel("Gender");
        l.setBounds(90,90,40,25);

        male=new JRadioButton("Male");
        male.setBounds(100,190,90,30);
        female=new JRadioButton("Female");
        female.setBounds(190,190,90,30);

        btn=new JButton("Submit");
        btn.setBounds(265,350,90,30);

        ButtonGroup grp=new ButtonGroup();
        grp.add(male);
        grp.add(female);

        add(male);
        add(female);
        add(btn);

        male.setSelected(true);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(male.isSelected()){
            System.out.println("Male");
        }else if(female.isSelected()){
            System.out.println("Female");
        }

    }
}

public class RadioExample {
    public static void main(String [] args){
        new RadioButtonExample();
    }
}
