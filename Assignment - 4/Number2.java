import java.util.*;
public class Number2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    System.out.println("Enter "+n+" numbers");
	    int a[]=new int[n];
	    Map<Integer,Integer> nm=new LinkedHashMap<>();
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        nm.put(a[i], nm.getOrDefault(a[i],0)+1);
	    }
	    int c=0;
	    for(int i:nm.keySet())
	    {
	        if(nm.get(i)>1)
	        {
	            c++;
	        }
	    }
	    int b[]=new int[c];
	    int j=0;
	    for(int i:nm.keySet())
	    {
	        if(nm.get(i)>1)
	        {
	            b[j++]=i;
	        }
	    }
	    System.out.println("The numbers are");
	    for(int i:b)
	    {
	        System.out.print(i+" ");
	    }
	}
}