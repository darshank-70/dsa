package com.example.binary_trees;

public class InOrder {
    static void traversal(Node root){
        // L - N - R
        if(root == null){
            return;
        }
        traversal(root.left);
        System.out.print(root.data + " ");
        traversal(root.right);
    }
}
