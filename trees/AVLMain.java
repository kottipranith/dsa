import java.util.Scanner;

public class AVLMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        AVLSolution sol = new AVLSolution();
        AVLNode root = null;
        System.out.println("Enter no of nodes");
        int n = sc.nextInt();
        while(n-- > 0){
            root = sol.insertNode(root, sc.nextInt());
        }
        sol.inOrder(root);
        System.out.println();
        sc.close();
    }
}
