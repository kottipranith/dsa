import java.util.Scanner;

public class SumOfAndOfSubArrays {
    // approach 1 : brute force
    /*
    * Approach 2 :
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            long ans = 0;
            for(int i = 0; i < n; i++){
                int res = a[i];
                ans += res;
                for(int j = i+1; j < n; j++){
                    if(res == 0)
                        break;
                    res &= a[j];
                    ans += res;
                }
            }
            System.out.println(ans);
        }
    }

}
