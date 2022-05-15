import java.util.*;
public class Number8{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
         if(task(a,n))
         {
             System.out.println("The array is sorted sequencially");
         }
         else
         {
             System.out.println(-1);
         }
         
     }
     static boolean task(int a[], int n)
     {
         for(int i=0;i<n;i++)
         {
             if(i!=a[i])
             {
                 return false;
             }
         }
         return true;
     }
}