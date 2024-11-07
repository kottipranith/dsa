import java.util.Scanner;

public class UnInfectedLaptops {
    private static int[] di = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int dj[] = {0, 1, 1, 1, 0, -1, -1, -1};
    private static void dfs(int a[][], int i, int j){
        if(i < 0 || j < 0 || i >= a.length || j>= a[0].length)
            return;
        if(a[i][j] == 0 || a[i][j] == -1)
            return;
        a[i][j] = -1;
        for(int x = 0; x < 8; x++){
            dfs(a,i+di[x], j + dj[x]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int m[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                m[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(m[i][j] == 3)
                    dfs(m,i,j);
            }
        }
        int ans = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(m[i][j] == 1)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
