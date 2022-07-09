import java.util.*;
class Number5
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
        int i=0,j=n-1;
        while(i<=j)
        {
            if(a[i]%2==1)
            {
                i++;
            }
            else
            {
                int d=a[i];
                a[i]=a[j];
                a[j]=d;
                j--;
            }
        }
        for(int m:a)
        {
            System.out.print(m+" ");
        }
    }
}