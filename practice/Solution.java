public class Solution {
    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }else if(root.val > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public TreeNode insertItr(TreeNode root,int val){
        TreeNode nn = new TreeNode(val);
        if(root == null)
            return nn;
        TreeNode ptr = root;
        while(true){
            if(val > ptr.val ){
                if(ptr.right == null) {
                    ptr.right = nn;
                    break;
                }else{
                    ptr = ptr.right;
                }
            }else {
                if(ptr.left == null) {
                    ptr.left = nn;
                    break;
                }else{
                    ptr = ptr.left;
                }
            }
        }
        return root;
    }
    public int findMax(TreeNode root){
        if(root == null)
            return 0;
        TreeNode ptr = root;
        while(ptr.right != null)
            ptr = ptr.right;
        return ptr.val;
    }
    public TreeNode deleteNode(TreeNode root, int val){
        if(root == null)
            return null;
        if(root.val == val) {
            //No child case
            if (root.left == null && root.right == null) {
                return null;
            }

            //single child case
            if (root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //2 child case
            int mx = findMax(root.left);
            root.val = mx;
            root.left = deleteNode(root.left, mx);
            return root;
        }else if(val < root.val){
            root.left = deleteNode(root.left,val);
        }else{
            root.right = deleteNode(root.right, val);
        }
        return root;
    }
    public void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
