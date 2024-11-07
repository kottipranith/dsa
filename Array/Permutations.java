import java.util.ArrayList;
import java.util.List;

// Leetcode 46
// Generate all the possible permutations of the given array

public class Permutations {

    private static void helper(int nums[], boolean taken[], List<Integer> res, List<List<Integer>> ans) {
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(!taken[i]){

                flag = true;
                taken[i] = true;
                res.add(nums[i]);
                helper(nums, taken, res, ans);
                taken[i] = false;
                res.remove(res.size()-1);
            }
        }
        if(flag == false)
            ans.add(new ArrayList<>(res));
    }

    public static List<List<Integer>> generateAllPermutations(int nums[]) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean taken[] = new boolean[nums.length];
        List<Integer> t = new ArrayList<>();
        helper(nums, taken, t, ans);
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,3};
        System.out.println(generateAllPermutations(nums));

    }
}