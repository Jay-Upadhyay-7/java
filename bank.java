import java.util.Scanner;
class Account{
  int accountno;
  String name;
  int amount;
  Account(int accountno,int amount,String name){
    this.accountno=accountno;
    this.name=name;
    this.amount=amount;
  }
  void deposit(int d){
     amount=amount+d;
     System.out.println("Amount after depositing "+d+" rupee is: "+amount);
  }
  void withdraw(int w){
    if(w>amount){
      System.out.println("Not enough balance");
    }
    else{
      System.out.println("transaction Successfull! Updated amount is: "+amount);
    }
  }
  void display(){
    System.out.println("name: "+name);
    System.out.println("Account no : "+accountno);
    System.out.println("Balance amount: "+amount);
  }
  public static void main(String args[]){
    Account obj=new Account(1234,2400,"jay");
    int choice=1,x,y;
    System.out.println("bank details: --------");
    obj.display();
    Scanner sc= new Scanner(System.in);
    while(choice!=0){
      System.out.println("enter 1 to deposit money, 2 to withdraw anount, 3 for account detail,0 to exit: ");
      choice=sc.nextInt();
    switch(choice){
      case 1:
         System.out.println("enter amount to deposit: ");
         x=sc.nextInt();
         obj.deposit(x);
         break;
      case 2:
         System.out.println("enter amount to withdraw: ");
         y=sc.nextInt();
         obj.withdraw(y);
         break;
      case 3:
        obj.display();
        break;
      case 0:
         break;
      default:
         System.out.println("enter correct choice ");
  }
}
}
}
