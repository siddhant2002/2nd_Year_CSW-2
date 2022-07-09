import java.util.*;
public class Number11
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> nm=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    nm.add(sc.nextInt());
		}
		int m=sc.nextInt();
		List<Integer> kk=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
		    kk.add(sc.nextInt());
		}
		int t=sc.nextInt();
		Map<Integer,Integer> k=new HashMap<>();
		for(int i=0;i<n;i++)
		{
		    k.put(nm.get(i),1);
		}
		for(int i=0;i<m;i++)
		{
		    if(k.containsKey(Math.abs(kk.get(i)-t)))
		    {
		        System.out.println(Math.abs(t-kk.get(i))+" "+kk.get(i));
		        return;
		    }
		}
		System.out.println("No such elements found");
	}
}