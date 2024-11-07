import java.util.Scanner;

public class LCS {

    private static int dp[][];

    // Top Down Dp
    private static int helper1(String s1, String s2, int i, int j){
        if(dp[i][j] != -1)
            return dp[i][j];
        if(i == s1.length()) // if s1 is emptuy
            return dp[i][j] = 0;
        if(j == s2.length()) // if s2 is empty
            return dp[i][j] = 0;

        if(s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 1 + helper1(s1, s2, i+1, j+1);
        else
            return dp[i][j] = Math.max(helper1(s1, s2, i, j+1), helper1(s1, s2, i+1, j));

    }

    // Bottom Up Dp
    private static int helper2(String s1, String s2, int i, int j){
        if(dp[i][j] != -1)
            return dp[i][j];

        if(i == 0)
            return dp[i][j] = 0;
        if(j == 0)
            return dp[i][j] = 0;
        if(s1.charAt(i-1) == s2.charAt(j-1))
            return dp[i][j] = 1 + helper2(s1, s2, i-1, j-1);
        return dp[i][j] = Math.max(helper2(s1, s2, i, j-1), helper2(s1, s2, i-1, j));
    }

    private static int findLenLcs(String s1, String s2){
        return helper1(s1, s2, 0, 0); // Top Down Call
        //return helper2(s1, s2, s1.length(), s2.length()); // Bottom Up Call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // declare dp
        int r = s1.length(), c = s2.length();
        dp = new int[r+1][c+1];

        // init memory
        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= c; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(findLenLcs(s1, s2));
    }
}
