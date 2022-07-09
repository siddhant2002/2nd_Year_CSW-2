import java.util.*;
class Number6
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
        int s=Integer.MAX_VALUE;
        for(int i:a)
        {
            if(s>i&&i>0)
            {
                s=i;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]-=s;
            if(a[i]>0)
            {
                c++;
            }
        }
        System.out.println("After reduction the numbers left are "+c);
    }
}