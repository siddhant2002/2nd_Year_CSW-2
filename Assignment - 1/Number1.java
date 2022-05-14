import java.util.*;
public class Number1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(prime(n))
         {
             System.out.println("Prime");
         }
         else
         {
             System.out.println("Not prime");
         }
     }
     static boolean prime(int n)
     {
         if(n<=1)
         {
             return false;
         }
         else if(n==2)
         {
             return true;
         }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if(n%i==0)
             {
                 return false;
             }
         }
         return true;
     }
}