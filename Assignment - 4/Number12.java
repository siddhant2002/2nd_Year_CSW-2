import java.util.*;
public class Number12
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int s=a[1]-a[0];
		for(int i=2;i<n;i++)
		{
		    if(a[i]-a[i-1]<s)
		    {
		        s=a[i]-a[i-1];
		    }
		}
		System.out.println("The minimum difference is "+s);
	}
}