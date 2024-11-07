import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfSubset {
    static List<List<Integer>> ans  = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    private static void helper(int wallet[], int sum, int i){
        if(i == wallet.length)
            return;
        if(sum == 0 ){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(path);
            ans.add(temp);
            return;
        }
        // if we exclude
        helper(wallet, sum , i+1);

        // if we include
        path.add(wallet[i]);
        helper(wallet, sum-wallet[i], i+1);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int wallet[] = new int[n];
        for(int i = 0; i < n; i++)
            wallet[i] = sc.nextInt();
        int sum = sc.nextInt();

        helper(wallet, sum, 0);
        System.out.println(ans);
    }
}
