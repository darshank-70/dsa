package com.example.binary_trees;
import com.example.binary_trees.PreOrder;
public class Work {
    static BinaryTree tree = new BinaryTree();
    static Node root = null;

    static Node getWorkTree() {
        return root;
    }

   static void  preOrderTraversal(){
    System.out.println("PREORDER TRAVERSAL is: ");
        Node root = getWorkTree();
        PreOrder.traversal(root);
}
static void inOrderTraversal(){
    System.out.println("INORDER TRAVERSAL is: ");
    Node root = getWorkTree();
    InOrder.traversal(root);
}
static void postOrderTraversal() {
    System.out.println("POST ORDER TRAVERSAL is");
    Node root = getWorkTree();
    PostOrder.traversal(root);
}
    public static void main(String[] args) {
        // given a array of nodes build a binary tree.
        int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        root = tree.buildTree(nodes);

        preOrderTraversal();
        inOrderTraversal();
        postOrderTraversal();
    }

}
