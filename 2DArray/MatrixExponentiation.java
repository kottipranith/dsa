import java.util.Scanner;

public class MatrixExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter matrix elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the power");
        int n = sc.nextInt();

        int [][]res = exponentiateMatxix(arr, n);
//        int t[][] = multiplyMatrix(new int[][]{{1,2}, {3,4}}, new int[][]{{1,2}, {3,4}});
        int ans[][] = multiplyMatrix(res, new int[][]{{1}, {0}});
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(10 + " th fibonnaci number is " + nThFibonnaci(10));
    }

    private static int[][] exponentiateMatxix(int[][] arr, int n) {
        if(n == 1){
            return arr;
        }else if(n%2 == 0){
            return multiplyMatrix(exponentiateMatxix(arr, n/2), exponentiateMatxix(arr, n/2));
        }else{
            return multiplyMatrix(exponentiateMatxix(exponentiateMatxix(arr, n/2), 2), arr);
        }
    }

    private static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int res[][] = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    private static int nThFibonnaci(int n){
        int t[][] = new int[][]{{1, 1}, {1, 0}};
        t = exponentiateMatxix(t, n-1);
        t = multiplyMatrix(t, new int[][]{{1}, {0}});
        return t[0][0];
    }
}
