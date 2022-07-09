import java.util.*;
public class Number16
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
		int c=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(a[i]+a[j]>a[j+1])
                {
                    c++;
                }
            }
        }
        System.out.println(c);
	}
}