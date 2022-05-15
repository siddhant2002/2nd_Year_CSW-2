import java.util.*;
public class Number1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ArrayList<Integer> nm=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
            nm.add(sc.nextInt());
         }
         System.out.println(nm);
         int k=sc.nextInt();
         if(task(nm,k))
         {
             System.out.println("Found");
         }
         else
         {
             System.out.println("Not found");
         }
         k=sc.nextInt();
         System.out.println(nm.remove(k));
         if(nm.isEmpty())
         {
             System.out.println("ArrayList is empty");
         }
         else
         {
             System.out.println("ArrayList is not empty");
         }
     }
     static boolean task(List<Integer> nm, int k)
     {
         for(int i=0;i<nm.size();i++)
         {
             if(nm.get(i)==k)
             {
                 return true;
             }
         }
         return false;
     }
}