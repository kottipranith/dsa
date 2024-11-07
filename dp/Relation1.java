import java.util.Arrays;

// f(n) = f(n-1) + f(n-2) + f(n-3)
public class Relation1 {
    private static int dp[];
    static {
        dp = new int[101];
        Arrays.fill(dp,-1);
    }
    static int find(int n){
        if( n<= 1)
            return 1;
        if(n == 2)
            return 3;
        if(dp[n] != -1)
            return dp[n];
        dp[n] = find(n-1) + find(n-2) + find(n-3);
        return dp[n];
    }
    public static void main(String[] args) {
        find(10);
        System.out.println(dp[10]);
    }
}
