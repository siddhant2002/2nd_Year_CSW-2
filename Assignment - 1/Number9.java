import java.util.*;
public class Number9{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         task(n,'a','c','b');
     }
     static void task(int n, char a, char b, char c)
     {
         if(n==0)
         {
             return;
         }
         task(n-1,a,c,b);
         System.out.println("Move disc "+n+" from rod "+a+" to rod "+b);
         task(n-1,c,b,a);
     }
}