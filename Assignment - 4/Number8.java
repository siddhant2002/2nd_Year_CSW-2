import java.util.*;
public class Number8
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=0;
		Set<Integer> nm=new HashSet<>();
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    nm.add(a[i]);
		}
		for(int i:nm)
		{
		    s+=i;
		}
		System.out.println("The sum is "+s);
	}
}