import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
public class SortOnFrequency {
    static void sortOnFrequency(int n,Integer a[])
    {
        Map<Integer,Integer> fq=new HashMap<>();
        for(int i=0;i<n;i++)
        fq.put(a[i],1+fq.getOrDefault(a[i], 0));
        Arrays.sort(a,(x,y)->{
            if(fq.get(x)!=fq.get(y)) return fq.get(y)-fq.get(x);
            else return y-x;
        });
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            sortOnFrequency(n,a);
        }
    }
}
