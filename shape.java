import java.util.*;
class Shape{
  void area(int a){
      int ar=a*a;
      System.out.println("Area of square = "+ar);
      }//square

  void area(float r){
      double ar=3.14*r*r;
      System.out.println("Area of circle = "+ar);
      } //circle

   void area(int a,int b){
      int ar=a*b;
      System.out.println("Area of rectangle = "+ar);
      }//rectangle
   void area(double c,int a,int b){
      double ar=c*a*b;
      System.out.println("Area of triangle = "+ar);
      }//triangle
  
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  float r=s.nextFloat();
  int a=s.nextInt();
  int b=s.nextInt();
  Shape sh= new Shape();
  sh.area(a);
  sh.area(r);
  sh.area(a,b);
  sh.area(0.5,a,b);
  

    
}
}
