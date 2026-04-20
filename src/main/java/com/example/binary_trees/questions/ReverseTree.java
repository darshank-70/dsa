package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

// reverse -> 
// left subtree
// right subtree
// SWAP left with right
public class ReverseTree {
    public static Node reverse(Node root){
        if(root == null) return null;

        Node left = reverse(root.left);
        Node right = reverse(root.right);
        root.left = right;
        root.right = left;
        return root;

    }
}
