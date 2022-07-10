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
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]==b[j])
            {
                i++;
            }
            if(a[i]>b[j])
            {
                int d=b[j];
                b[j]=a[i];
                a[i]=d;
                i++;
                j++;
            }
            else 
            {
                i++;
                j++;
            }
        }
        for(int p:a)
        {
            System.out.print(p+" ");
        }
        for(int p:b)
        {
            System.out.print(p+" ");
        }
    }
}