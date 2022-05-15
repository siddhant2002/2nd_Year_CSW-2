import java.util.*;
public class Number7{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         for(int i=0;i<n-1;i+=2)
         {
             swap(a,i,i+1);
         }
         for(int i:a)
         {
             System.out.print(i+" ");
         }
     }
     static void swap(int a[], int i, int j)
     {
        int d=a[i];
        a[i]=a[j];
        a[j]=d;
     }
}