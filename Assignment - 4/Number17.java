import java.util.*;
class Number17
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
        int m=Integer.MIN_VALUE,p=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
            if(a[i]>p&&a[i]!=m)
            {
                p=a[i];
            }
        }
        System.out.println("The 2nd largest element is "+p);
    }
}