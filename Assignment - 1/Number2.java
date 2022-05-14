import java.util.*;
public class Number2{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(binary(n));
     }
     static String binary(int n)
     {
         StringBuilder nm=new StringBuilder();
         while(n!=0)
         {
             nm.append(n%2);
             n/=2;
         }
         nm.reverse();
         return nm.toString();
     }
}