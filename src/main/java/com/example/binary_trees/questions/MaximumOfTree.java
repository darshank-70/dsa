package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class MaximumOfTree {
    public static int max(Node root){
        if(root == null ) return root.data;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(leftMax, rightMax);
    }
    
}
