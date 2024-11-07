import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlidingWindow {
    //window with max sum
    static long maxWinSum(int a[],int k)
    {
        int n = a.length;
        long sum = 0;
        for(int i = 0;i < k;i++) sum+=a[i];
        long mx = sum;
        for(int ws = 1;ws < n-k+1;ws++)
        {
            sum = sum - a[ws-1] + a[ws+k-1];
            mx=Math.max(mx,sum);
        }
        return mx;
    }

    //Max window sum start index and end index
    static List<Long> maxWinStartEnd(int a[],int k)
    {
        List<Long> ans = new ArrayList<>();

        int n = a.length;
        long sum = 0;
        for(int i = 0;i < k;i++) sum+=a[i];
        int start=0;
        int end=k-1;
        long mx = sum;
        for(int ws = 1;ws < n-k+1;ws++)
        {
            sum = sum - a[ws-1] + a[ws+k-1];
            if(mx < sum )
            {
                mx = sum;
                start=ws;
                end=ws+k-1;
            }
        }
        ans.add(mx);ans.add((long)start);ans.add((long)end);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//arraysize
        int k = sc.nextInt(n);//window size
        int a[] = new int[n];
        for(int i = 0;i < n;i++) a[i]=sc.nextInt();
        // System.out.println("The Maximum sum of window of length "+k+" is :"+maxWinSum(a,k));
        List<Long> ans = maxWinStartEnd(a, k);
        System.out.println("Max sum : "+ans.get(0)+" start index : "+ans.get(1)+" end index : "+ans.get(2));
        sc.close();
    }
}
