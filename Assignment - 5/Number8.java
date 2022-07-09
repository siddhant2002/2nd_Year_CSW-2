import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        Set<Integer> nm=new LinkedHashSet<>();
        Set<Integer> kk=new LinkedHashSet<>();
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            nm.add(a[i]);
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
            if(nm.contains(b[i]))
            {
                kk.add(b[i]);
            }
            nm.add(b[i]);
        }
        System.out.println("The union of both the arrays are "+nm);
        System.out.println("The intersection of both the arrays are "+kk);
    }
}