import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloydWarshellAlgo {
    static Scanner sc = new Scanner(System.in);
    static AdjacencyMatWeighted adjacencyMatWeighted = new AdjacencyMatWeighted();
    private static List<Integer>  findPath(int parent[][], int u, int v){
        List<Integer> path = new ArrayList<>();
        if(parent[u][v] == -1)
            return path;
        path.add(v);
        while(u != v){
            v = parent[u][v];
            path.add(0,v);
        }
        return path;
    }
    public static void main(String[] args) {
        // step 0: create a adjacency matrix
        int nv = sc.nextInt(), ne = sc.nextInt();
        int m[][] = adjacencyMatWeighted.readAdjMatWeighted(nv,ne);

        // step 1 : prepare distance matrix of size nxn where n is no of vertices

        long dist[][] = new long[nv][nv];
        int parent[][] = new int[nv][nv];
        for(int i = 0; i < nv; i++){
            for(int j = 0; j < nv; j++){
                parent[i][j] = -1;
                if(i == j) {
                    dist[i][j] = 0;
                }
                else if(m[i][j] != 0){
                    parent[i][j] = i;
                    dist[i][j] = m[i][j];
                }
                else {
                    dist[i][j] = m[i][j] == 0 ? 999 : m[i][j];
                }
            }
        }

        //step 2: compute the distances
        for(int mid = 0; mid < nv; mid++){
            for(int start = 0; start < nv; start++){
                for(int end = 0; end < nv; end++){
                    if(dist[start][mid] + dist[mid][end] < dist[start][end]) {
                        dist[start][end] = dist[start][mid] + dist[mid][end];
                        parent[start][end] = parent[mid][end];
                    }
                }
            }
        }

        System.out.println("Distance matrix");
//        distance matrix
        for(int i = 0; i < nv; i++){
            for(int j = 0; j < nv; j++){
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Parent matrix");
//        parent matrix
        for(int i = 0; i < nv; i++){
            for(int j = 0; j < nv; j++){
                System.out.print(parent[i][j] + " ");
            }
            System.out.println();
        }

        // path from u to v
        //System.out.println("Distance form 4 to 0 is : " + dist[4][0] + " and the path is : " + findPath(parent,4,0));

    }
}
/*
input:
------
        5 5
        0 2 5
        0 4 20
        2 4 7
        2 3 100
        4 3 25

        4 7
        0 1 5
        0 2 3
        1 0 7
        1 2 10
        2 3 20
        3 0 10
        3 1 1
*/
