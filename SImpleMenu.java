import java.awt.*;

class Test{
    Frame f;
    MenuBar bar;
    Menu file,name;
    MenuItem close,blank;

    public Test(){
        f=new Frame();
        f.setSize(550,450);

        bar=new MenuBar();
        f.setMenuBar(bar);

        file=new Menu("File");
        name=new Menu("Name");
        close=new MenuItem("Close");
        blank=new MenuItem("Blank");

        bar.add(file);
        file.add(name);
        file.add(close);
        name.add(blank);

        f.setLayout(null);
        f.setVisible(true);
    }

}

public class SImpleMenu{
   public static void main(String [] args) {
        new Test();
    }
   }
