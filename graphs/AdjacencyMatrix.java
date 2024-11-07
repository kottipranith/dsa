import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Given the number of vertices and number of edges along with the edges compute the adjacency matrix for a directed graph*/

public class AdjacencyMatrix {
    private static void printMat(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[] calculateInDegree(int mat[][]){
        int indeg[] = new int[mat.length];

        for(int j = 0; j < mat[0].length; j++){
            int c = 0;
            for(int i = 0; i < mat.length; i++){
                if(mat[i][j] != 0){
                    c++;
                }
            }
            indeg[j] = c;
        }
        return indeg;
    }
    private static int[] calculateOutDegree(int mat[][]){
        int outdeg[] = new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            int c = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] != 0){
                    c++;
                }
            }
            outdeg[i] = c;
        }
        return outdeg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertices and edges");
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        int mat[][] = new int[nv][nv];
        System.out.println("Enter the edges");
        for(int i = 0; i < ne; i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            mat[j][k] = 1;
        }
        printMat(mat);
        System.out.println("Indegree of vertices" + Arrays.toString(calculateInDegree(mat)));
        System.out.println("Outdegree f vertices" + Arrays.toString(calculateOutDegree(mat)));
    }
}
