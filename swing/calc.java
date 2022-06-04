import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calc extends JFrame implements ActionListener{
      JTextField tf1,tf2,tf3;
      calc(){
       
       JLabel l1= new JLabel(" first no :");
       JLabel l2= new JLabel(" second no :");
       JLabel l3= new JLabel(" result is :");
       tf1=new JTextField(20);
       tf2=new JTextField(20);
       tf3=new JTextField(20);
       JButton b1= new JButton("sum"); 
       JButton b2= new JButton("sub"); 
       setLayout(new FlowLayout());
       add(l1);
       add(tf1);
       add(l2);
       add(tf2);
       add(b1);
       add(b2);
       add(l3); 
       add(tf3);
       b1.addActionListener(this);
       b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
  int result=0;
  String s=e.getActionCommand();
  if(s.equals("sum")){
  result=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());}
  else{
   result=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());}
  tf3.setText(Integer.toString(result));
}
public static void main(String args[]){
    calc c=new calc();
       c.setSize(500,300);
       c.setVisible(true);
    
}}
