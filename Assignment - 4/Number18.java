import java.util.*;
public class Number18
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
        System.out.println("The the n/2th index element is "+a[n/2]);
	}
}