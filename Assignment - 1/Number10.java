import java.util.*;
public class Number10{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         System.out.println("The GCD of the numbers are "+task(n,m));
     }
     static int task(int a, int b)
     {
         if(b==0)
         {
             return a;
         }
         return task(b,a%b);
     }
}