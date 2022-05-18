import java.util.*;
    public class Number1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Set<String> nm=new HashSet<>();
         for(int i=1;i<=n;i++)
         {
             nm.add(sc.nextLine());
         }
         System.out.println(nm);
     }
}