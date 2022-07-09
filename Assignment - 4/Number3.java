import java.util.*;
public class Number3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n=sc.nextInt();
	    List<Integer> kk=new ArrayList<>();  
	    Set<Integer> nm=new LinkedHashSet<>();
	    for(int i=0;i<n;i++)
	    {
	        kk.add(sc.nextInt());
	        nm.add(kk.get(i));
	    }
	    kk.clear();
	    for(int i:nm)
	    {
	        kk.add(i);
	    }
	    System.out.println(kk);
	}
}