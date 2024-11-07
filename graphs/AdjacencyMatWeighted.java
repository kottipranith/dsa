import java.util.Scanner;

public class AdjacencyMatWeighted {
    Scanner sc = new Scanner(System.in);
    public int[][] readAdjMatWeighted(int nv, int ne){
        int m[][] = new int[nv][nv];
        for(int i = 0; i < ne; i++){
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            m[u][v] = w;
            //m[v][u] = w;
        }
        return m;
    }
    public void printAdjMat(int m[][]){
        int nv = m.length;
        for(int i = 0; i < nv; i++){
            for(int j = 0; j < nv; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
