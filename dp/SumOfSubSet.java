import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Array elements");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Target sum");
        int sum = sc.nextInt();
        boolean m[][] = new boolean[n+1][sum+1];
        for(int i = 0; i < n+1; i++)
            m[i][0] = true;
        for(int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (m[i - 1][j] == true)
                    m[i][j] = true;
                else {
                    int cur = a[i - 1];
                    if (j >= cur) {
                        m[i][j] = m[i - 1][j - cur];
                    }
                }
            }
        }
        System.out.println(m[n][sum]);

    }
}
