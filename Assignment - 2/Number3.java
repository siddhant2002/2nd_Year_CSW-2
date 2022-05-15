import java.util.*;
public class Number3{

     Scanner sc=new Scanner(System.in);
         String n=sc.next();
         int k=n.length();
         Stack<Integer> nm=new Stack<>();
         for(int i=0;i<k;i++)
         {
             char p=n.charAt(i);
             if(p=='+'||p=='-'||p=='x'||p=='/')
             {
                 int b=nm.pop();
                 int a=nm.pop();
                 if(p=='+')
                 {
                     a+=b;
                 }
                 else if(p=='-')
                 {
                     a-=b;
                 }
                 else if(p=='x')
                 {
                     a*=b;
                 }
                 else if(p=='/')
                 {
                     a/=b;
                 }
                 nm.push(a);
             }
             else
             {
                 nm.push(n.charAt(i)-'0');
             }
         }
         System.out.println(nm.pop());
     }
}