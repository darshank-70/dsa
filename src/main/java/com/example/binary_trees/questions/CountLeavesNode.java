package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class CountLeavesNode {
    public static int count(Node root){
        if(root == null) return 0;
        //since it is a leaf node, contribute 1 to the count.
        if(root.left == null && root.right == null) return 1;
        return count(root.left) + count(root.right);
    }
}
