package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class CountNodes {
    
    public static int count(Node root){
        //recursively calculat left subtree Count + right SubtreeCount + 1 
      if(root == null) return 0;
      int leftCount = count(root.left);
      int rightCount = count(root.right);
      return leftCount + rightCount + 1;
}
}