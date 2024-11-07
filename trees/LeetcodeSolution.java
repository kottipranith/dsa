import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.w3c.dom.Node;

public class LeetcodeSolution {

    //level order successor (asked in google)
    public TreeNode levelOrderSuccessor(TreeNode root,int key){
        if(root == null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left != null)
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);
            if(node.val == key && !q.isEmpty())
                return q.peek();
            
        }
        return null;
    }
    //leetcode 102 (level order traversal)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 1;i <= size ;i++){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            ans.add(temp);
        }
        return ans;
    }

    //leetcode 637 (average of level)
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i = 0;i < size; i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            ans.add((double)sum/size);
        }
        return ans;
    }

    //leetcode 103 (level order zigzag traversal)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 1; i <= size; i++){
                TreeNode node = q.poll();
                if(flag){
                    temp.add(node.val);
                }else{
                    temp.add(0,node.val);
                }
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            if(flag)
                flag = false;
            else
                flag = true;
            ans.add(temp);
        }
        return ans;
    }

    //leetcode 107 (bottom level order traversal)
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 1;i <= size ;i++){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
            }
            ans.add(0,temp);
        }
        return ans;
    }

    //leetcode 116 (populating next pointers)
    /*
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 1; i <= size; i++ ){
            Node node = q.poll();
            if(!q.isEmpty() && i != size)
                node.next = q.peek();
            if(node.left != null)
                q.add(node.left);
            if(node.right != null)
                q.add(node.right);
            }
        }
        return root;
    }*/
}
