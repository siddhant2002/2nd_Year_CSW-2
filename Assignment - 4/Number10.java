import java.util.*;
public class Number10
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int t=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		Map<Integer,Integer> nm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		    if(nm.containsKey(t-a[i]))
		    {
		        System.out.println(t-a[i]+" "+a[i]);
		        return;
		    }
		    nm.put(a[i],1);
		}
		System.out.println("No such elements found");
	}
}