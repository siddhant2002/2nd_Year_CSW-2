import java.util.*;
public class Number9
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=Integer.MIN_VALUE,p=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]<p&&a[i]>0)
		    {
		        p=a[i];
		    }
		    if(a[i]<0&&a[i]>s)
		    {
		        s=a[i];
		    }
		}
		System.out.println("The numbers are "+s+" "+p);
	}
}