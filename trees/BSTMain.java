import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTSolution sol = new BSTSolution();
        TreeNode root=null;
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        while(n-->0){
            root=sol.insertNodeIter(root, sc.nextInt());
        }
        
        //inorder traversal
        List<Integer> inorder=sol.inOrder(root);
        System.out.println(inorder);
        sc.close();

        //Seacrhing element
        List<Integer> path = new ArrayList<>();
        boolean found = sol.findX(root, 5, path);
        if (found){
            System.out.print("Path : ");
            for(int x : path) System.out.print(x+" ");System.out.println();
        }

        //finding maximum element
        TreeNode mx = sol.findMaxRecursive(root);
        System.out.println("Maximum value : "+mx.val);

        //finding minimum element
        TreeNode mn =sol.findMinRecursive(root);
        System.out.println("Minimum value : "+mn.val);

        //Deleting a node
        sol.deleteNode(root, 12);
        sol.inOrderWithOutList(root);
    }
}
