import java.util.*;
public class Number11{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         System.out.println("The permutations are ");
         task(a,0,n,n);
     }
     static void task(int a[], int i, int j, int n)
     {
         if(i==n)
         {
             for(int p=0;p<n;p++)
             {
                 System.out.print(a[p]+" ");
             }
             System.out.println();
         }
         for(int p=i;p<j;p++)
         {
             swap(a,i,p);
             task(a,i+1,j,n);
             swap(a,i,p);
         }
     }
     static void swap(int a[], int i, int j)
     {
         int d=a[i];
         a[i]=a[j];
         a[j]=d;
     }
}