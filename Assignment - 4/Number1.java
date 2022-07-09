import java.util.*;
public class Number1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    System.out.println("Enter "+n+" numbers");
	    int a[]=new int[5];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Set<Integer> nm=new HashSet<>();
	    for(int i=0;i<n;i++)
	    {
	        if(nm.contains(a[i]))
	        {
	            System.out.println("The number is "+a[i]);
	            return;
	        }
	        nm.add(a[i]);
	    }
	    System.out.println("No such element matches the criteria");
	}
}