package Assignment - 1;

public import java.util.*;
public class Number6{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int s=Integer.MIN_VALUE;
         int p=0;
         for(int i=0;i<n;i++)
         {
             p+=a[i];
             s=Math.max(s,p);
             if(p<0)
             {
                 p=0;
             }
         }
         System.out.println(s);
     }
} {
    
}
