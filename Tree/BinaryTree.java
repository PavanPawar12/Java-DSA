import java.util.Scanner;

public class BinaryTree {
    // int count;
    // public BinaryTree(){
    //     this.count = 1;
    // }
    public static class Node{
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    // insert an element in the tree
    public void populate(Scanner scanner){
        System.out.print("Enter the Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.print("Do you want to enter left of " + node.val + " (true/false): ");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to enter right of " + node.val + " (true/false): ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        } 
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right,indent + "\t");
        
    }

    public void pretyDisplay(){
        pretyDisplay(root, 0);
    }

    private void pretyDisplay(Node node, int level){
        if(node == null) return;
        pretyDisplay(node.right, level + 1);
        if(level != 0){
            for(int i = 0; i < level - 1; i++){
                System.out.println("|\t\t");
            }
            System.out.println("|----->" + node.val);
        }else{
            System.out.println(node.val);
        }
        pretyDisplay(node.left, level + 1);

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner); // build tree
        // tree.display();  // print tree
        tree.pretyDisplay();
        scanner.close();

    }
}


// public class BinaryTree{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//         }
//         public Node(){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryT{
//         static int index = -1;
//         public static Node buildTree(int[] nodes){
//             index++;
//             if(nodes[index] == -1) return null;

//             Node newNode = new Node(nodes[index]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }
//     public static void main(String[] args) {
//         int[] nodes = {12,3,-1,-1,4,-1,5,6};
//         BinaryT tree = new BinaryT();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);
//     }
// }
