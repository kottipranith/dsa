import java.util.Scanner;

public class LongestSubArrayWithMaximumAnd {
    // The maximum "And" of array is the largest element in the array.
    private static int solve(int nums[]){ // Here we are returning the length of the longest sub array with maximum "And"
        int mx = Integer.MIN_VALUE;
        for(int i : nums)
            mx = Math.max(mx,i);
        int i = 1;
        int len = 0;
        int maxLen = 1;
        if(nums[0] == mx)
            len++;
        while(i < nums.length){
            if(nums[i] == mx)
                len++;
            else
                len = 0;
            maxLen = Math.max(maxLen,len);
            i++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int ans = solve(arr);
        System.out.println(ans);
    }
}
