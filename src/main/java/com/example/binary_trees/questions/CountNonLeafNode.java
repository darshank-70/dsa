package com.example.binary_trees.questions;

import com.example.binary_trees.Node;

public class CountNonLeafNode {
    public static int count(Node root) {
        if(root== null) return 0;
        //A non Leaf node is any node which is not a leaf node
        //Its like current Node contribution is based on if it is a leaf node or a Node.
        //if its Leaf node, ignore -> so return 0;
        if(root.left == null && root.right == null) return 0;

        else return 1 + count(root.left) + count(root.right);

    }
}
