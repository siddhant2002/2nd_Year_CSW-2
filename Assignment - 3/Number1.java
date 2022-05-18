import java.util.*;
    public class Number1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Set<Integer> nm=new TreeSet<>();
         for(int i=n;i>=1;i--)
         {
             nm.add(i);
         }
         System.out.println(nm);
         int k=sc.nextInt();
         System.out.println(nm.contains(k));
         k=sc.nextInt();
         System.out.println(nm.remove(k));
         System.out.println(nm);
     }
}