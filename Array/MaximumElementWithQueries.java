import java.util.Scanner;

public class MaximumElementWithQueries {

    // approach 1 : brute force
    // appraoach 2 : using delta array

    private static void increment(int a[], int i, int j, int x){
        for(int k = i; k <= j; k++)
            a[k] += x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int q = sc.nextInt();
            int delta[] = new int[n+1];
            while(q-- > 0){
                int i = sc.nextInt(), j = sc.nextInt(), x = sc.nextInt();
                increment(a, i, j, x);
                // delta[i] += x;
                // delta[j+1] += -1*x;
            }
            // for(int i = 1; i < n; i++)
            //     delta[i] = delta[i] + delta[i-1];
            int ans = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++)
                //ans = Math.max(ans,a[i]+delta[i]);
                ans = Math.max(ans,a[i]);
            System.out.println(ans);
        }
    }
}
