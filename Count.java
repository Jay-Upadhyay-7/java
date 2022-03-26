class Count{
  static int c;
  Count(){
   c++;}
  void display(){
    System.out.println("total object created : "+c);
   }
public static void main(String args[]){
    Count a=new Count();
    Count b=new Count();
   Count c=new Count();
   c.display();
}
}

