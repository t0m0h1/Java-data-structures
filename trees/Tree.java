package trees;



// Simple binary tree class that includes methods to construct a tree of ints.
// Methods are provided to add a node, to print the tree in inorder, preorder
// and postorder traversal, and to print the tree's structure.


class Node {
    // instance variables
    public int data;

    // applicable to binary trees
    public Node left;
    public Node right;


    public Node(int data) {
        // Constructor logic here
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setNodeData(int data) {
        this.data = data;
    }

    public int getNodeData() {
        return this.data;
    }

    public void pointToLeftNode(Node left) {
        this.left = left;
    }

    public void pointToRightNode(Node right) {
        this.right = right;
    }


}




class Tree extends Node {
    // instance variables
    public Node root;

    public Tree() {
        super(0);
        root = null;
    }

    public void setRootNode(Node root) {
        this.root = root;
    }

    public void setLeftNode(Node left) {
        this.left = left;
    }

    public void setRightNode(Node right) {
        this.right = right;
    }
}




class Main {

    // main method - driver code
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(1);
        tree.setRootNode(root);
        Node left = new Node(2);
        tree.setLeftNode(left);
        Node right = new Node(3);
        tree.setRightNode(right);


        // add more nodes

        // left child of left node and right child of left node
        Node leftChild1 = new Node(4);
        left.pointToLeftNode(leftChild1);
        Node leftChild2 = new Node(5);
        left.pointToRightNode(leftChild2);


        // left child of right node and right child of right node
        Node rightChild1 = new Node(6);
        right.pointToLeftNode(rightChild1);
        Node rightChild2 = new Node(7);
        right.pointToRightNode(rightChild2);


        // show the tree
        // System.out.println(tree.root.getNodeData());
        // System.out.println(tree.left.getNodeData());
        // System.out.println(tree.right.getNodeData());


        // visually show the tree structure
        System.out.println("Tree structure:");
        System.out.println("    " + tree.root.getNodeData());
        System.out.println("   / \\");
        System.out.println("  " + tree.left.getNodeData() + "   " + tree.right.getNodeData());
        System.out.println(" / \\ / \\");
        System.out.println(tree.left.left.getNodeData() + "  " + tree.left.right.getNodeData() + " " + tree.right.left.getNodeData() + "  " + tree.right.right.getNodeData());


    }
}