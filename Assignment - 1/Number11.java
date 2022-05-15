import java.util.*;
public class Number11{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         List<Integer> nm=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             nm.add(sc.nextInt());
         }
         System.out.println("The permutations are ");
         task(nm,0,n,n);
     }
     static void task(List<Integer> nm, int i, int j, int n)
     {
         if(i==n)
         {
             System.out.println(nm);
         }
         for(int p=i;p<j;p++)
         {
             swap(nm,i,p);
             task(nm,i+1,j,n);
             swap(nm,i,p);
         }
     }
     static void swap(List<Integer> nm, int i, int j)
     {
         int d=nm.get(i);
         nm.add(i,nm.get(j));
         nm.remove(i+1);
         nm.add(j,d);
         nm.remove(j+1);
     }
}