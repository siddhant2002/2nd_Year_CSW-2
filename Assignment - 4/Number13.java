import java.util.*;
public class Number13
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
		    b[i]=sc.nextInt();
		}
		int s=Math.abs(a[0]-b[0]);
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        if(Math.abs(a[i]-b[i])<s)
		        {
		            s=Math.abs(a[i]-b[i]);
		        }
		    }
		}
		System.out.println("The minimum difference is "+s);
	}
}