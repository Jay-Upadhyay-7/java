class Bank{
 float getROI(){
      return (float)2.0;
 }
}
class HDFC extends Bank{
 float getROI(){
      return (float)4.0;
 }
}
class SBI extends Bank{
 float getROI(){
      return (float)4.5;
 }
}
class PNB extends Bank{
 float getROI(){
      return (float)5.0;
 }
}
public class main{
   public static void main(String args[]){
     Bank b=new Bank();
     System.out.println(b.getROI());
     b=new HDFC();
     System.out.println(b.getROI());
     b=new SBI();
     System.out.println(b.getROI());
     b=new PNB();
     System.out.println(b.getROI());
}
}
