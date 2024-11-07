public class AVLNode {
    int val;
    int h;
    AVLNode left;
    AVLNode right;
    AVLNode(int val){
        this.val=val;
        this.h=1;
        this.left=null;
        this.right=null;
    }
}
