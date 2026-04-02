class TreeNode{
    int val;
    int count;
    TreeNode left, right;

    
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    } 
}

public class BasicTree{
    public int count;
    BasicTree(){
        this.count = 0;
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        
        inorder(root.right);
    }

    public static int countNode(TreeNode root){
        if(root == null){
            return 0;
        }
        // recursive call 
        int leftCount = countNode(root.left);
        int rigtCount = countNode(root.right);
        return 1+ leftCount + rigtCount;
    }
    public static void main(String[] args){
        TreeNode tree = new TreeNode(99);
        tree.left = new TreeNode(13); 
        tree.left.left = new TreeNode(13); 
        tree.right = new TreeNode(30); 
        tree.right.right = new TreeNode(90); 
        // inorder(tree);
        System.out.println(countNode(tree));
        // System.out.println(tree.val);
        // System.out.println(tree.left.val);
        // System.out.println(tree.right.val);
    }
}