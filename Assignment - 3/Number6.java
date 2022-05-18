import java.util.*;
    public class Number6{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Map<Integer,Integer> nm=new HashMap<>();
         for(int i=1;i<=n;i++)
         {
             int k=sc.nextInt();
             nm.put(k,nm.getOrDefault(k,0)+1);
         }
         System.out.println(nm);
     }
}