import java.util.*;
    public class Number7{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Set<Integer> nm=new HashSet<>();
         for(int i=1;i<=n;i++)
         {
             nm.add(sc.nextInt());
         }
         System.out.println(nm);
     }
}