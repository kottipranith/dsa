import java.util.Arrays;
import java.util.Scanner;

public class MaximumIntervalsOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int entry[]=new int[n];
            int exit[]=new int[n];
            for(int i=0;i<n;i++) entry[i]=sc.nextInt();

            for (int i = 0;i < n; i++) exit[i] = sc.nextInt();

            Arrays.sort(entry);
            Arrays.sort(exit);
            int in=1;int max_in=1;int i=1;int j=0;
            while(i<n && j<n)
            {
                if(entry[i]<=exit[j])
                {
                    in++;
                    if(in>max_in) max_in=in;
                    i++;
                }
                else
                {
                    in--;
                    j++;
                }
            }
            System.out.println(max_in);
        }
        sc.close();
    }
}
