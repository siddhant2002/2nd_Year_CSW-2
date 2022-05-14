import java.util.*;
public class Number3{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(reverse(n));
     }
     static int reverse(int n)
     {
         int rev=0;
         while(n!=0)
         {
             rev=rev*10+(n%10);
             n/=10;
         }
         return rev;
     }
}