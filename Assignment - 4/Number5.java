import java.util.*;
public class Number5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int s=Integer.MIN_VALUE,p=Integer.MAX_VALUE;
	    Set<Integer> nm=new HashSet<>();
	    System.out.println("Enter "+n+" numbers");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        nm.add(a[i]);
	        if(a[i]<p)
	        {
	            p=a[i];
	        }
	        if(a[i]>s)
	        {
	            s=a[i];
	        }
	    }
	    System.out.println("The values are");
	    for(int i=p;i<=s;i++)
	    {
	        if(!nm.contains(i))
	        {
	            System.out.print(i+" ");
	        }
	    }
	}
}