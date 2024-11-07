import java.util.*;
/* Given number of rows and columns and initial coordinates , you need to fill the matrix in north, east, south, and west directions*/
/*
* sample input:
* -------------
*   3 3
*   1 1
*
* sample output:
* -------------
*   9 2 3
*   8 1 4
*   7 6 5
* */
class Pos{
    int i, j;
    public Pos(int i, int j) { this.i = i; this.j = j;}
}
class BFSMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        int si = sc.nextInt(), sj = sc.nextInt();

        bfs(m, si, sj);

        for (int i = 0; i < r; i++) { // Print adj matrix.
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[] di = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dj = {0, 1, 1, 1, 0, -1, -1, -1};
    static void bfs(int[][] m, int si, int sj){
        int r = m.length, c = m[0].length;
        Queue<Pos> q = new LinkedList<>(); // deque
        q.add(new Pos(si, sj));
        m[si][sj] = -1; // -1 is visited
        int counter = 1;
        while(!q.isEmpty()){
            Pos f = q.remove();
            m[f.i][f.j] = counter++;

            for(int x = 0; x < 8; x++){
                int ni = f.i + di[x], nj = f.j + dj[x];
                if(ni>=0 && nj >=0 && ni<r && nj <c && m[ni][nj] == 0){
                    q.add(new Pos(ni, nj));
                    m[ni][nj] = -1;
                }
            }
        }
    }
}