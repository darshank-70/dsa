package com.example.binary_trees;

public interface PreOrder {
    // pre order is N - L - R 
    static void traversal(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        traversal(root.left);
        traversal(root.right);
    }
}
