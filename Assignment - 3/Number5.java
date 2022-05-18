import java.util.*;
    public class Number5{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Set<Double> nm=new LinkedHashSet<>();
         for(int i=1;i<=n;i++)
         {
             nm.add(sc.nextDouble());
         }
         System.out.println(nm);
     }
}