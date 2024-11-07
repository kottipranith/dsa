import java.util.Scanner;

public class Kadane {
    //Maximum sum of array
    static long maxSumOfSubArray(int a[])
    {
        long mx = Long.MIN_VALUE;
        long cur = 0;
        for(int i = 0;i < a.length ;i++)
        {
            cur+=a[i];
            mx=Math.max(mx,cur);
            if(cur<0) cur=0;
        }
        return mx;
    }
    //maximum sum of array and its start index and end index
    static void maxSumOfSubArrayStartEnd(int a[])
    {
        long mx = Long.MIN_VALUE;
        long cur = 0;
        int start = -1,end = -1,tempStart=-1;
        for(int i = 0;i < a.length ;i++)
        {
            if(cur == 0) tempStart = i ;
            cur+=a[i];
            if(mx < cur)
            {
                mx = cur;
                end = i;
                start = tempStart;
            }
            if(cur<0) cur=0;
        }
        System.out.println("Sum " +mx+" start index : "+start+" end index : "+end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n;i++) a[i] = sc.nextInt();
        maxSumOfSubArrayStartEnd(a);
    }
}
