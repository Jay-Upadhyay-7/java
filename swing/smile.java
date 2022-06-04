import javax.swing.*;
import java.awt.*;

class smile extends Canvas{
     
      public void paint(Graphics g){
             g.setColor(Color.yellow);
             g.fillOval(50,50,200,200);
             g.setColor(Color.black);
             g.fillOval(113,115,30,30);
             g.fillOval(185,115,30,30);
             g.fillOval(100,160,120,60);
             g.setColor(Color.yellow);
             g.fillOval(100,160,120,30);
             g.fillOval(100,170,120,40);
             }
      public static void main(String args[]){
         smile s=new smile();
          JFrame f=new JFrame();
           f.setSize(300,400);
           f.setVisible(true); 
           f.add(s); 
    }

}
