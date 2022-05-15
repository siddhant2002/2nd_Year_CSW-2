import java.util.*;
public class Number5{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int k=sc.nextInt();
         int b[]=new int[k];
         for(int i=0;i<k;i++)
         {
             b[i]=a[i];
         }
         int i;
         for(i=0;i<n-k;i++)
         {
             a[i]=a[i+k];
         }
         for(int j=0;j<k;j++,i++)
         {
             a[i]=b[j];
         }
         for(int j:a)
         {
             System.out.print(j+" ");
         }
     }
}