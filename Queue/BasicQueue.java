import java.util.*;
class TreeNode{
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
    
}

public class BasicQueue{
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(1);
        // q.offer(2);
        // q.offer(3);
        // System.out.println(q);
        // System.out.println(q.poll());    
        // System.out.println(q);    
        // System.out.println(q.peek());
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            System.out.println(node.val);
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }
        }
       

    }
}