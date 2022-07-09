import java.util.*;
public class Number6
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int r=0;
	    System.out.println("Enter "+n+" numbers");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        r^=a[i];
	    }
	    System.out.println("The element is "+r);
	}
}