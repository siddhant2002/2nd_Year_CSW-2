import java.util.*;
    public class Number2{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Map<String,String> nm=new TreeMap<>();
         for(int i=0;i<n;i++)
         {
             String p=sc.next();
             String q=sc.next();
             nm.put(p,q);
         }
         System.out.println(nm);
     }
}