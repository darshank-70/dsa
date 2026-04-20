package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class ExistsInTree {
    public static boolean exists(Node root,int key){
        if(root == null) return false;

        boolean existsInLeftSubtree = exists(root.left, key);
        boolean existsInRightSubtree = exists(root.right, key);
        return existsInLeftSubtree || existsInRightSubtree || root.data == key;
    }
    
}
