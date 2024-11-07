import java.util.ArrayList;
import java.util.List;

public class BSTSolution {

    //inserting node using recursion
    TreeNode insertNode(TreeNode root,int x){
        if (root == null) 
            return new TreeNode(x);
        else if (root.val < x)
            root.right=insertNode(root.right, x);
        else
            root.left=insertNode(root.left, x);
        
        return root;
    }

    //inserting node uing iteration
    public TreeNode insertNodeIter(TreeNode root,int x){
        TreeNode nn = new TreeNode(x);
        if (root == null) return nn;
        TreeNode temp = root;
        while(temp != null){
            if(x < temp.val){
                if(temp.left == null){
                    temp.left = nn;break;
                }
                temp=temp.left;
            }else{
                if(temp.right == null){
                    temp.right = nn;break;
                }
                temp=temp.right;
            }
        }
        return root;
    }

    //Inorder traversal
    public List<Integer> inOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        inOrderHelper(root,ans);
        return ans;
    }

    private void inOrderHelper(TreeNode root,List<Integer> ans){

        if(root != null){
            inOrderHelper(root.left, ans);
            ans.add(root.val);
            inOrderHelper(root.right, ans);
        }
    }

    //inorder without return 
    public void inOrderWithOutList(TreeNode root){
        if(root != null){
            inOrderWithOutList(root.left);
            System.out.print(root.val+" ");
            inOrderWithOutList(root.right);
        }
    }
    //searching an element
    boolean findX(TreeNode root,int x,List<Integer> path){
        if(root == null) return false;
        TreeNode temp = root;

        while(temp != null){
            if (x == temp.val)
                return true;
            else if (x < temp.val){
                path.add(0);
                temp=temp.left;
            }else{
                path.add(1);
                temp=temp.right;
            }
        }
        return false;
    }

    //Finding maximum element
    TreeNode findMax(TreeNode root){
        if ( root == null) return null;
        TreeNode temp = root;
        while(temp.right != null) 
            temp=temp.right;
        return temp;
    }

    //finding minimum element
    TreeNode findMin(TreeNode root){
        if(root == null) return null;
        TreeNode temp = root;
        while(temp.left != null)
            temp=temp.left;
        return temp;
    }

    //finding maximum value recursively
    TreeNode findMaxRecursive(TreeNode root){
        if(root == null || root.right == null) return root;
        return findMaxRecursive(root.right);
    }

    //finding minimum recursively
    TreeNode findMinRecursive(TreeNode root){
        if (root == null || root.left == null) return root;
        return findMinRecursive(root.left);
    }

    //delete node by value
    TreeNode deleteNode(TreeNode root,int x){

        if(root == null) return null;
        if(root.val == x){

            //no child case
            if(root.left == null && root.right == null) 
                return null;
            //1 child case (only right)
            if(root.left == null)
                return root.right;
            //1 child case (only left)
            if(root.right == null)
                return root.left;

            //2 children case
            TreeNode mx = findMax(root.left);
            root.val = mx.val;
            root.left = deleteNode(root.left, mx.val);
            return root;

        }else if(x < root.val){
            root.left = deleteNode(root.left, x);
        }else{
            root.right = deleteNode(root.right, x);
        }
        return root;
    }
}
