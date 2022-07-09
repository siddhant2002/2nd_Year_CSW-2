import java.util.*;
public class Number4
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int s=0;
	    System.out.println("Enter "+n+" numbers");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        s+=a[i];
	    }
	    int p=n*(n+1)/2;
	    System.out.println("The missing element is "+(p-s));
	}
}