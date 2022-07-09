import java.util.*;
public class Number2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0,m=0,q=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    if(a[i]==0)
		    {
		        c++;
		    }
		    else if(a[i]==1)
		    {
		        m++;
		    }
		    else
		    {
		        q++;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    if(c!=0)
		    {
		        a[i]=0;
		        c--;
		    }
		    else if(m!=0)
		    {
		        a[i]=1;
		        m--;
		    }
		    else
		    {
		        a[i]=2;
		        q--;
		    }
		}
		for(int i:a)
		{
		    System.out.print(i+" ");
		}
	}
}