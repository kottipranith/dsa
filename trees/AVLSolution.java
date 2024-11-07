public class AVLSolution {
    public AVLNode insertNode(AVLNode root,int x){
        if (root == null) 
            return new AVLNode(x);
        else if (x < root.val)
            root.left = insertNode(root.left, x);
        else
            root.right = insertNode(root.right, x);

        updateHeight(root);
        if(getBF(root) == 2){//left heavy

            if(getBF(root.left) == 1){ // LL case
                root = rotateRight(root);
            }else{// LR case
                root.left = rotateLeft(root.left);
                root = rotateRight(root);
            }

        }else if(getBF(root) == -2){//right heavy

            if(getBF(root.right) == -1){ // RR case
                root = rotateLeft(root);
            }else{// RL case
                root.right = rotateLeft(root.right);
                root = rotateRight(root);
            }
        }
        
        return root;

    }

    public AVLNode rotateLeft(AVLNode root){
        AVLNode newroot = root.right;
        AVLNode t2 = newroot.left;
        root.right = t2;
        updateHeight(root);
        newroot.left = root;
        updateHeight(newroot);
        return newroot;
    }

    public AVLNode rotateRight(AVLNode root){
        AVLNode newroot = root.left;
        AVLNode t2 = newroot.right;
        root.left = t2;
        updateHeight(root);
        newroot.right = root;
        updateHeight(newroot);
        return newroot;
    }

    public void updateHeight(AVLNode root){
        root.h = Math.max(
            root.left == null ? 0 : root.left.h + 1,
            root.right == null ? 0 : root.right.h + 1
        );
    }

    public int getBF(AVLNode root){
        return (root.left != null ? root.left.h : 0) - (root.right != null ? root.right.h : 0);
    }

    public void inOrder(AVLNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
    }
}
