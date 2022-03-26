import java.util.*;
class Student{
  static String uniname = "GEHU";
  int rollno;
  String name; 
  String branch;
  String section;

  Student(String n,String k,int a,String b, String c){
     rollno=a;
     branch=b;
     section=c;
     name=n;
     uniname=k;
}

  void get(){
        System.out.println("University name : "+uniname);
	System.out.println("Student name : "+name);
	System.out.println("University rollno:  "+rollno);
	System.out.println("Student branch : "+branch);
	System.out.println("Section : "+section);
   } 
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter Student deatils 1.Student name 2.university name, 3.Roll no, 4.branch 5.section  ");
      String name=sc.nextLine();
      String Uniname=sc.nextLine();
      int rollno=sc.nextInt();
      sc.nextLine();
      String branch=sc.nextLine();
      String section=sc.nextLine();
      Student obj=new Student(name,Uniname,rollno,branch,section);
      obj.get();
     
}





}
  
