import java.util.*;
public class Number12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         int k=sc.nextInt();
         int p=bs(a,0,a.length-1,k);
         if(p==-1)
         {
             System.out.println("Element not found");
         }
         else
         {
             System.out.println("Element is found");
         }
     }
     static int bs(int a[], int i, int j, int n)
     {
         if(i<=j)
         {
             int m=i+(j-i)/2;
             if(a[m]==n)
             {
                 return m;
             }
             else if(a[m]>n)
             {
                 return bs(a,i,m-1,n);
             }
             else
             {
                 return bs(a,m+1,j,n);
             }
         }
         return -1;
     }
}