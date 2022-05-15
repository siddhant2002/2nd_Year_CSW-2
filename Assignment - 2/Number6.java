import java.util.*;
public class Number6{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            nm.add(new ArrayList<>());
        }
        nm.get(0).add(1);
        nm.get(1).add(2);
        nm.get(2).add(3);
        nm.get(3).add(4);
        nm.get(4).add(0);
        nm.get(1).add(0);
        nm.get(2).add(1);
        nm.get(3).add(2);
        nm.get(4).add(3);
        nm.get(5).add(7);
        nm.get(7).add(5);
        nm.get(6).add(3);
        nm.get(7).add(1);
        nm.get(8).add(1);
        nm.get(9).add(1);
        nm.get(7).add(5);
        nm.get(3).add(6);
        nm.get(9).add(1);
        nm.get(1).add(9);
        nm.get(2).add(8);
        nm.get(8).add(2);
        nm.get(1).add(5);
        nm.get(5).add(1);
        nm.get(1).add(7);
        nm.get(7).add(1);
        boolean k[]=new boolean[n];
        Queue<Integer> kk=new LinkedList<>();
        kk.offer(0);
        List<Integer> ff=new ArrayList<>();
        k[0]=true;
        ff.add(0);
        while(!kk.isEmpty())
        {
            int p=kk.poll();
            for(int f:nm.get(p))
            {
                if(!k[f])
                {
                    k[f]=true;
                    kk.offer(f);
                    ff.add(f);
                }
            }
        }
        System.out.println(ff);
    }
}