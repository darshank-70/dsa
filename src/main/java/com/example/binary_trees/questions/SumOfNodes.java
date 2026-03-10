package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class SumOfNodes {
    static int sum(Node root){
        // find sum of left subtree + right Subtree + root
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    
    }
}
