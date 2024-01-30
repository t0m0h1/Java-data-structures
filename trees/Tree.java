package trees;



// Simple binary tree class that includes methods to construct a tree of ints.
// Methods are provided to add a node, to print the tree in inorder, preorder
// and postorder traversal, and to print the tree's structure.


class Node {
    // Add a constructor that takes no arguments
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

    public void setLeftNode(Node left) {
        this.left = left;
    }

    public void setRightNode(Node right) {
        this.right = right;
    }


}




public class Tree extends Node {

    public Node root; // first node of tree

    public Tree() {
        super(); // Call the superclass constructor
        root = null;
    }
}

