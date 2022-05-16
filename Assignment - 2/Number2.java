import java.util.*;
public class Number2
{
	public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         List<Student> nm=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             nm.add(new Student(sc.next(),sc.nextInt(),sc.nextInt()));
         }
         System.out.println(nm);
         System.out.println(count(nm));
     }
     static int count(List<Student> nm)
     {
         return nm.size();
     }
}
class Student extends Main
{
    String name;
    int age,mark;
    Student(String name, int age, int mark)
    {
        this.name=name;
        this.age=age;
        this.mark=mark;
    }
}