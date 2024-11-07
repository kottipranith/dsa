import java.util.Scanner;

public class Lps {

    private static int helper(String s, int i, int j){
        if(i == j)
            return 1;
        if(i+1 == j){
            if(s.charAt(i) == s.charAt(j))
                return 2;
            return 1;
        }

        if(s.charAt(i) == s.charAt(j))
            return 2 + helper(s, i+1, j-1);

        return Math.max(helper(s, i, j-1), helper(s, i+1, j));
    }
    private static int lpsLen(String s){
        return helper(s, 0, s.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lpsLen(s));
    }
}
