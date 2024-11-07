import java.util.Scanner;

public class IsTherePathUDFS {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nv = sc.nextInt();
        int ne = sc.nextInt();
        UDFS udfs = new UDFS(nv);
        for(int i = 0; i < ne; i++){
            int u = sc.nextInt(), v = sc.nextInt();
            udfs.merge(u,v);
        }
        // If both has a same leader there exists a path elso no
        if(udfs.p[1] == udfs.p[3])
            System.out.println("There exits a path b/w 1 and 3");
    }
}
