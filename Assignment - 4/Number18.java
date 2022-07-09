import java.util.*;
public class Number18
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> nm=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    nm.add(sc.nextInt());
		}
		for(int i=0;i<nm.size()-1;i++)
		{
		    if(nm.get(i)>nm.get(i+1))
		    {
		        System.out.println(nm.get(i));
		        return;
		    }
		}
	}
}