import java.util.*;
class Number3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if (a[i]<=k)
            {
                c++;
            }
        }
        int m=0;
        for (int i=0;i<c;i++)
        {
            if (a[i]>k)
            {
                m++;
            }
        }
        int s=m;
        for(int i=0,j=c;j<n;i++,j++)
        {
            if (a[i]>k)
            {
                m--;
            }
            if (a[j]>k)
            {
                m++;
            }
        }
        System.out.println(Math.min(s, m));
    }
}