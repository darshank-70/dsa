package com.example.binary_trees;

public class PostOrder {
    static void traversal(Node root){
        // L -  R -  N
        if(root == null){
            return;
        }
        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data + " ");
    }
}
