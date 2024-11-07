import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeNode root = null;
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        root = sol.insertItr(root, 1);
        root = sol.insertItr(root, 2);
        root = sol.insertItr(root, 3);
        sol.inorder(root);
        sol.deleteNode(root,3);
        sol.inorder(root);
    }
}
