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
        this.data = 0;
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
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(1);
        tree.setRootNode(root);
        Node left = new Node(2);
        tree.setLeftNode(left);
        Node right = new Node(3);
        tree.setRightNode(right);
        System.out.println(tree.root.getNodeData());
        System.out.println(tree.left.getNodeData());
        System.out.println(tree.right.getNodeData());
    }
}