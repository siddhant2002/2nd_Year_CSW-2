import java.util.*;
class Number4
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
        int m=sc.nextInt();
        int b[]=new int[m];
        for (int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(b[0]>b[1])
        {
            for(int i=0;i<n/2;i++)
            {
                int d=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=d;
            }
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}