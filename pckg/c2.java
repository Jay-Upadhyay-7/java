package p2;
import p1.*;
import java.util.*;
public class c2 implements I1{

   public int multi(int x,int y){
     return x*y;}

   public static void main(String args[]){
        c1 obj=new c1();
        c2 o=new c2();
        System.out.println(obj.sum(5,7));
        System.out.println(obj.div(3.4,2.1));
        System.out.println(o.multi(3,2));
        
} }
