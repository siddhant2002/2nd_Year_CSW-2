import java.util.*;
class Number7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=a[0];
        for(int i=1;i<n;i++)
        {
            m^=a[i];
        }
        m=m&~(m-1);
        int p=0,q=0;
        for(int i=0;i<n;i++)
        {
            if((m&a[i])>0)
            {
                p^=a[i];
            }
            else
            {
                q^=a[i];
            }
        }
        System.out.println("The two numbers are "+p+" and "+q);
    }
}