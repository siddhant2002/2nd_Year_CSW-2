import java.util.*;
public class Number3{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Stack<Integer> nm=new Stack<>();
         while(n!=0)
         {
             nm.push(n%2);
             n/=2;
         }
         StringBuilder nm=new StringBuilder();
         while(!nm.isEmpty())
         {
             nm.append(nm.pop());
         }
         System.out.println(nm);
     }
}